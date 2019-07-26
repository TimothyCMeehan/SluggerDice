package com.tcmslugger.game.vo;

import java.util.List;
import java.util.Set;

public class TeamVO {
	private String teamName;
	private Set<PlayerVO> roster;
	private PlayerVO startingPitcher;
	private List<PlayerVO> startingLineup;
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
	/**
	 * @return the startingPitcher
	 */
	public PlayerVO getStartingPitcher() {
		return startingPitcher;
	}
	/**
	 * @param startingPitcher the startingPitcher to set
	 */
	public void setStartingPitcher(PlayerVO startingPitcher) {
		this.startingPitcher = startingPitcher;
	}
	/**
	 * @return the startingLineup
	 */
	public List<PlayerVO> getStartingLineup() {
		return startingLineup;
	}
	/**
	 * @param startingLineup the startingLineup to set
	 */
	public void setStartingLineup(List<PlayerVO> startingLineup) {
		this.startingLineup = startingLineup;
	}

}
