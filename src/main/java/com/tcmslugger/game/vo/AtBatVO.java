package com.tcmslugger.game.vo;

public class AtBatVO {
	
	private PlayerVO pitcher;
	private PlayerVO batter;
	private String outcome;
	private String lastBaseReached;
	/**
	 * @return the pitcher
	 */
	public PlayerVO getPitcher() {
		return pitcher;
	}
	/**
	 * @param pitcher the pitcher to set
	 */
	public void setPitcher(PlayerVO pitcher) {
		this.pitcher = pitcher;
	}
	/**
	 * @return the batter
	 */
	public PlayerVO getBatter() {
		return batter;
	}
	/**
	 * @param batter the batter to set
	 */
	public void setBatter(PlayerVO batter) {
		this.batter = batter;
	}
	/**
	 * @return the outcome
	 */
	public String getOutcome() {
		return outcome;
	}
	/**
	 * @param outcome the outcome to set
	 */
	public void setOutcome(String outcome) {
		this.outcome = outcome;
	}
	public String getLastBaseReached() {
		return lastBaseReached;
	}
	public void setLastBaseReached(String lastBaseReached) {
		this.lastBaseReached = lastBaseReached;
	}

}
