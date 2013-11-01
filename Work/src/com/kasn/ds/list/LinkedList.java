package com.kasn.ds.list;

public class LinkedList<E> {

	private class Node {
		E item;
		Node nextNode;
	}
	private int size;
	private Node head;
	private Node tail;
	
	public int length(){
		return size;
	}
	
	public boolean contains(E element){
		for(int i=0; i<size; i++){
			
		}
		return false;
	}
	
	public boolean isEmpty(){
		return head==null;
	}
	
	public void insert(E element){
		Node newNode = new Node();
		newNode.item = element;
		newNode.nextNode = null;
		if(head==null || tail==null){						
			head = newNode;
			tail = newNode;
		} else {
			tail.nextNode = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void insertAtHead(E element){
		Node newNode = new Node();
		newNode.item = element;
		newNode.nextNode = head;
		head = newNode;		
		size++;
	}
	
	public void insertAt(E element, int index){
		Node newNode = new Node();
		newNode.item = element;
		Node prevNode = traverseTo(index-1);
		newNode.nextNode = prevNode.nextNode;
		prevNode.nextNode = newNode;
		size++;
	}
	
	public E elementAt(int index) throws Exception{		
		if(index>size-1){
			throw new Exception("IndexOutOfBoundException");
		}
		return traverseTo(index).item;
	}
	
	private Node traverseTo(int index){
		Node nodeAtIndex = new Node();
		nodeAtIndex = head;
		while(index-->0){
			nodeAtIndex = nodeAtIndex.nextNode;
		}	
		return nodeAtIndex;
	}
	
	public E[] toArray(){
		if(size>0){
			E[] array = (E[])new Object[size];
			int i=0;
			Node pointer = new Node();
			pointer = head;
			while(pointer!=null){
				System.out.println(pointer.item);
				array[i++]=pointer.item;
				pointer=pointer.nextNode;
			}
			return array;
		}
		return null;
	}
	
	public void deleteAll(){
		head = null;
		tail = null;
		size=0;
	}
	
	public void deleteAt(int index){
		Node prevNode = traverseTo(index-1);
		prevNode.nextNode = traverseTo(index).nextNode;
		size--;
	}
	
}
