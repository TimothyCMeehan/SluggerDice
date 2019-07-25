package com.tcmslugger.game.util;

import com.tcmslugger.game.vo.PlayerVO;
import com.tcmslugger.game.vo.TeamVO;

public class TeamUtil {
	
	public void addPlayerToTeam(PlayerVO player, TeamVO team){
		
		team.getRoster().add(player);
	}
	
	public Integer getRosterSize(TeamVO team){
		
		return team.getRoster().size();
		
	}

}
