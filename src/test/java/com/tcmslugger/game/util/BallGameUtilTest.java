package com.tcmslugger.game.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tcmslugger.game.vo.BallGameVO;
import com.tcmslugger.game.vo.TeamVO;

public class BallGameUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		BallGameUtil gameUtil = new BallGameUtil();
		
		HalfInningUtil inningUtil = new HalfInningUtil();
		
		TeamUtil teamUtil = new TeamUtil();
		
		AtBatUtil atBatUtil = new AtBatUtil();
		
		BallGameVO game = new BallGameVO();
		
		TeamVO homeTeam = teamUtil.createNewTeam("Bulldogs");
		TeamVO awayTeam = teamUtil.createNewTeam("Herons");
		
		gameUtil.PlayBall(game, homeTeam, awayTeam, inningUtil, teamUtil, atBatUtil);
		System.out.println(gameUtil.getInningsPlayed(game));
	}

}
