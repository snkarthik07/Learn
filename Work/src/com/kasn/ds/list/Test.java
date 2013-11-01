package com.kasn.ds.list;

public class Test {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		int i =0;
		while(i<10)
			list.insert(i++);
		try{
//			list.deleteAt(3);
//			list.insertAtHead(10);
//			list.toArray();
//			System.out.println(list.elementAt(3));
//			System.out.println(list.elementAt(9));
			list.toArray();
//			System.out.println(list.elementAt(7));
		} catch(Exception ex){
			System.out.println("Exception caught");
		}
	}

}
