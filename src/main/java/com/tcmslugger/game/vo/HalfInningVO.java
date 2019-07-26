package com.tcmslugger.game.vo;

import java.util.List;

public class HalfInningVO {
	//should this include the batting order or just be kept dumb?
	private List<AtBatVO> atBats;
	private Integer nextBattingPositionUp;

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

	/**
	 * @return the nextBattingPositionUp
	 */
	public Integer getNextBattingPositionUp() {
		return nextBattingPositionUp;
	}

	/**
	 * @param nextBattingPositionUp the nextBattingPositionUp to set
	 */
	public void setNextBattingPositionUp(Integer nextBattingPositionUp) {
		this.nextBattingPositionUp = nextBattingPositionUp;
	}

}
