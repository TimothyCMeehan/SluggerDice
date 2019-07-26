package com.tcmslugger.game.util;

import java.util.ArrayList;
import java.util.List;

import com.tcmslugger.game.constants.SluggerConstants;
import com.tcmslugger.game.vo.AtBatVO;
import com.tcmslugger.game.vo.HalfInningVO;
import com.tcmslugger.game.vo.PlayerVO;
import com.tcmslugger.game.vo.TeamVO;

public class HalfInningUtil {
	
	public Integer getOutsInInning(HalfInningVO halfInning, AtBatUtil atBatUtil){
		List<AtBatVO> atBats = halfInning.getAtBats();
		Integer outs = 0;
		for(AtBatVO atBat : atBats){
			String atBatOutcome = atBatUtil.atBatOutcome(atBat);
			if(SluggerConstants.ATBAT_OUTCOME_OUT.equals(atBatOutcome)){
				outs++;
			}
		}
		return outs;
	}
	
	public HalfInningVO playHalfInning(TeamVO teamUpToBat, TeamVO teamFielding, Integer playerPositionUp,
			TeamUtil teamUtil, AtBatUtil atBatUtil){
		HalfInningVO halfInning = new HalfInningVO();
		halfInning.setAtBats(new ArrayList<AtBatVO>());
		PlayerVO pitcher = teamUtil.getStartingPitcher(teamFielding);
		int nextUp = playerPositionUp;
		
		int outs = getOutsInInning(halfInning, atBatUtil);
		while(outs < SluggerConstants.OUTS_IN_INNING){
			PlayerVO batter = teamUtil.getBatterAtPosition(teamUpToBat, nextUp);
			AtBatVO newAtBat = atBatUtil.playAtBat();
			halfInning.getAtBats().add(newAtBat);
			if(nextUp == 8){
				nextUp = 0;
			} else {
				nextUp++;
			}
			outs = getOutsInInning(halfInning, atBatUtil);
		}
		
		halfInning.setNextBattingPositionUp(Integer.valueOf(nextUp));
		return halfInning;
	}
	
	public int getNextPlayerPositionUp(HalfInningVO halfInning){
		return halfInning.getNextBattingPositionUp();
	}

}
