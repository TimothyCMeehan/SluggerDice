package com.tcmslugger.game.vo;

import java.util.List;

public class BallGameVO {

	private TeamVO homeTeam;
	private TeamVO awayTeam;
	private List<HalfInningVO> homeInnings;
	private List<HalfInningVO> awayInnings;
	/**
	 * @return the homeTeam
	 */
	public TeamVO getHomeTeam() {
		return homeTeam;
	}
	/**
	 * @param homeTeam the homeTeam to set
	 */
	public void setHomeTeam(TeamVO homeTeam) {
		this.homeTeam = homeTeam;
	}
	/**
	 * @return the awayTeam
	 */
	public TeamVO getAwayTeam() {
		return awayTeam;
	}
	/**
	 * @param awayTeam the awayTeam to set
	 */
	public void setAwayTeam(TeamVO awayTeam) {
		this.awayTeam = awayTeam;
	}
	/**
	 * @return the homeInnings
	 */
	public List<HalfInningVO> getHomeInnings() {
		return homeInnings;
	}
	/**
	 * @param homeInnings the homeInnings to set
	 */
	public void setHomeInnings(List<HalfInningVO> homeInnings) {
		this.homeInnings = homeInnings;
	}
	/**
	 * @return the awayInnings
	 */
	public List<HalfInningVO> getAwayInnings() {
		return awayInnings;
	}
	/**
	 * @param awayInnings the awayInnings to set
	 */
	public void setAwayInnings(List<HalfInningVO> awayInnings) {
		this.awayInnings = awayInnings;
	}

}
