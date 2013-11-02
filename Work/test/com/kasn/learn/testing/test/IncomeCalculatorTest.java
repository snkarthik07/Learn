package com.kasn.learn.testing.test;

import static org.junit.Assert.*;
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.kasn.learn.testing.ICalcMethod;
import com.kasn.learn.testing.IncomeCalculator;
import com.kasn.learn.testing.Position;

public class IncomeCalculatorTest {

	private ICalcMethod calcMethod;
	private IncomeCalculator calc;
	
	
	@Before
	public void setup() throws Exception{
		calcMethod = createNiceMock(ICalcMethod.class);
		calc = new IncomeCalculator();
	}
	
	@Test
	public void testcalc1(){
		expect(calcMethod.calc(Position.BOSS)).andReturn(7000.0).anyTimes();
		expect(calcMethod.calc(Position.PROGRAMMER)).andReturn(5000.0).anyTimes();
		
		replay(calcMethod);
		
		calc.setCalcMethod(calcMethod);
		
		try{
			calc.calc();
			fail("Exception did not occur");
		} catch (RuntimeException e) {
			
		}
		
		calc.setPosition(Position.BOSS);
		assertEquals(7000.0, calc.calc(),0);
//		assertEquals(7000.0, calc.calc(),0);
		calc.setPosition(Position.PROGRAMMER);
		assertEquals(5000.0, calc.calc(), 0);
		verify(calcMethod);
	}
}
