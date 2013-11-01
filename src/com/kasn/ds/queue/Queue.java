package com.kasn.ds.queue;

public class Queue<E> {
	
	private class Node {
		E item;
		Node next;
	}
	
	private Node head;
	private Node tail;
	
	public void enqueue(E data){
		if(head==null || tail ==null){
			Node node = new Node();
			node.item = data;
			head = node;
			tail = node;
		} else {
			Node node= new Node();
			node.item = data;
			tail.next = node;
			tail = node;
		}
	}
	
	public E dequeue() throws Exception{
		if(!isEmpty()){
			E data = head.item;
			head = head.next;
			return data;
		} else {
			throw new Exception("Queue underflow");
		}
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
}
