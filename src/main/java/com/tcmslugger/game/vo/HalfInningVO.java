package com.tcmslugger.game.vo;

import java.util.List;

public class HalfInningVO {
	//should this include the batting order or just be kept dumb?
	private List<AtBatVO> atBats;

	/**
	 * @return the atBats
	 */
	public List<AtBatVO> getAtBats() {
		return atBats;
	}

	/**
	 * @param atBats the atBats to set
	 */
	public void setAtBats(List<AtBatVO> atBats) {
		this.atBats = atBats;
	}

}
