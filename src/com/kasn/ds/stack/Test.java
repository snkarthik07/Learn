package com.kasn.ds.stack;

public class Test {

	 public static void main(String args[]) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		pop(stack);
		stack.push(8);
		while(!stack.isEmpty()){
			pop(stack);
		}	
		
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Quick");
		stringStack.push("brown");
		stringStack.push("fox");
		stringStack.push("jumps");
		stringStack.push("over");
		while(!stringStack.isEmpty()){
			pop(stringStack,0);
		}
		
	}
	
	public static void pop(Stack<Integer> stack){
		try{
			System.out.println(stack.pop());
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	
	public static void pop(Stack<String> stack, int value){
		try{
			System.out.println(stack.pop());
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
}
