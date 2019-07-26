package com.tcmslugger.game.util;

import java.util.ArrayList;

import com.tcmslugger.game.vo.PlayerVO;
import com.tcmslugger.game.vo.TeamVO;

public class TeamUtil {
	
	public TeamVO createNewTeam(String teamName){
		TeamVO team = new TeamVO();
		team.setStartingLineup(new ArrayList<PlayerVO>());
		team.setTeamName(teamName);
		for(int i = 0; i < 9; i++ ){
			PlayerVO player = new PlayerVO();
			team.getStartingLineup().add(player);
		}
		
		return team;
	}
	
	public void addPlayerToTeam(PlayerVO player, TeamVO team){
		
		team.getRoster().add(player);
	}
	
	public Integer getRosterSize(TeamVO team){
		
		return team.getRoster().size();
		
	}
	
	public PlayerVO getStartingPitcher(TeamVO team){
		return team.getStartingPitcher();
	}
	
	public PlayerVO getBatterAtPosition(TeamVO team, int position){
		return team.getStartingLineup().get(position);
	}

}
