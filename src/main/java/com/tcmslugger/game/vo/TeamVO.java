package com.tcmslugger.game.vo;

import java.util.Set;

public class TeamVO {
	private String teamName;
	private Set<PlayerVO> roster;
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	/**
	 * @return the roster
	 */
	public Set<PlayerVO> getRoster() {
		return roster;
	}
	/**
	 * @param roster the roster to set
	 */
	public void setRoster(Set<PlayerVO> roster) {
		this.roster = roster;
	}

}
