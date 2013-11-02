package com.kasn.ds.stack.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.kasn.ds.stack.Stack;

public class StackTest {

	@Test
	public void testIsEmpty(){
		Stack<Integer> stack  = new Stack<Integer>();
		stack.push(5);
		assertFalse(stack.isEmpty());
	}
	
	@Test
	public void testIsEmptyUsingMock(){
		
	}

}
