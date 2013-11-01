package com.kasn.ds.queue;

public class Test {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		do{
			display(queue);
		} while(!queue.isEmpty());
	}	
	
	public static void display(Queue<Integer> queue){
		try {
			System.out.println(queue.dequeue());
		} catch (Exception ex) {
			System.out.println("Exception caught");
			System.out.println(ex.getMessage());
		}
	}
}
