package com.tcmslugger.game.util;

import java.util.ArrayList;
import java.util.List;

import com.tcmslugger.game.constants.SluggerConstants;
import com.tcmslugger.game.vo.BallGameVO;
import com.tcmslugger.game.vo.HalfInningVO;
import com.tcmslugger.game.vo.TeamVO;

public class BallGameUtil {
	
	public void PlayBall(BallGameVO game, TeamVO homeTeam, TeamVO awayTeam, HalfInningUtil inningUtil, TeamUtil teamUtil, AtBatUtil atBatUtil){
		game.setHomeTeam(homeTeam);
		game.setAwayTeam(awayTeam);
		int homeTeamPositionUp = 0;
		int awayTeamPositionUp = 0;
		game.setAwayInnings(new ArrayList<HalfInningVO>());
		game.setHomeInnings(new ArrayList<HalfInningVO>());
		Integer inningsPlayed = getInningsPlayed(game);
		while(inningsPlayed < Integer.valueOf(SluggerConstants.INNINGS_IN_BALLGAME - 1 )){
			System.out.println(inningsPlayed);
			HalfInningVO topHalf = inningUtil.playHalfInning(awayTeam, homeTeam, awayTeamPositionUp, teamUtil, atBatUtil);
			addHalfInningToInningsPlayed(topHalf, game.getAwayInnings());
			awayTeamPositionUp = topHalf.getNextBattingPositionUp();
			
			HalfInningVO bottomHalf = inningUtil.playHalfInning(homeTeam, awayTeam, homeTeamPositionUp, teamUtil, atBatUtil);
			addHalfInningToInningsPlayed(bottomHalf, game.getHomeInnings());
			homeTeamPositionUp = bottomHalf.getNextBattingPositionUp();
			
			inningsPlayed = getInningsPlayed(game);
		}
		
	}
	
	public Integer getInningsPlayed(BallGameVO game){
		
		return Integer.valueOf(game.getHomeInnings().size());
	}
	
	public void addHalfInningToInningsPlayed(HalfInningVO inning, List<HalfInningVO> inningsPlayed){
		inningsPlayed.add(inning);
	}
	
	public HalfInningVO getLastHalfInning(List<HalfInningVO> inningsPlayed){
		int inningCount = inningsPlayed.size();
		return inningsPlayed.get(inningCount - 1);
	}

}
