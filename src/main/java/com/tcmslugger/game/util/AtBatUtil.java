package com.tcmslugger.game.util;

import com.tcmslugger.game.constants.SluggerConstants;
import com.tcmslugger.game.vo.AtBatVO;

public class AtBatUtil {
	
	public AtBatVO playAtBat(){
		AtBatVO atBat = new AtBatVO();
		double rando = (Math.random() * 10.0);
		
		if(rando >= 8){
			atBat.setOutcome(SluggerConstants.ATBAT_OUTCOME_SCORED);
		} else {
			atBat.setOutcome(SluggerConstants.ATBAT_OUTCOME_OUT);
		}
		System.out.println(atBat.getOutcome());
		return atBat;
	}
	
	public String atBatOutcome(AtBatVO atBat){
		return atBat.getOutcome();
	}

}
