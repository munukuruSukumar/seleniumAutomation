package com.sample.calcTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.calc.Calculator;

public class AdditionTest {

	
	@Test
	public void testAdditionFunctionality() {
		
		int input1 = 100;
		int input2 = 200;
		int expResult = 300;
		
		int actResult = Calculator.addition(input1, input2);
		
		Assert.assertEquals(actResult, expResult);
		System.out.println("test executed successfully");
		
	}
	
}
