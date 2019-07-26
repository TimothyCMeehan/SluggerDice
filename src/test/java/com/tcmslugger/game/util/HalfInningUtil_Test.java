package com.tcmslugger.game.util;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tcmslugger.game.vo.AtBatVO;
import com.tcmslugger.game.vo.HalfInningVO;

public class HalfInningUtil_Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		HalfInningUtil inningUtil = new HalfInningUtil();
		AtBatUtil atBatUtil = new AtBatUtil();
		HalfInningVO inning = new HalfInningVO();
		List<AtBatVO> atBats = new ArrayList<>();
		AtBatVO atBat = new AtBatVO();
		atBat.setOutcome("Out");
		atBats.add(atBat);
		
		inning.setAtBats(atBats);
		Integer outs = inningUtil.getOutsInInning(inning, atBatUtil);
		assertEquals(Integer.valueOf(1), outs);
		
		
	}

}
