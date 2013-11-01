package com.kasn.ds.stack;

public class Stack<E>{
	
	private class node {
		E value;
		node prevNode;
	}
//	private int size;
	private node head;
	
	public Stack(){
//		this.size = size;
		
	}
	
	public void push(E value){
		if(head==null){
			head = new node();
			head.value = value;
			head.prevNode = null;
		} else {
			node newNode = new node();
			newNode.value=value;
			newNode.prevNode = head;
			head = newNode;			
		}
	}
	
	public E pop() throws Exception{
		if(head==null){
			throw new Exception();
		} 
		E value = head.value;
		head = head.prevNode;
		return value;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
}
