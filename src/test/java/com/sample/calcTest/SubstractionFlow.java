package com.sample.calcTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.calc.Calculator;

public class SubstractionFlow {

	
	@Test
	public void testSubstractionFunctionality() {
		
		int input1 = 100;
		int input2 = 200;
		int expResult = 100;
		
		int actResult = Calculator.substraction(input2, input1);
		
		Assert.assertEquals(actResult, expResult);
		System.out.println("test executed successfully");
		
	}
	
}
