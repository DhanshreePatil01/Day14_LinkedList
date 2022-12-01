package com.Bridgelabz;

public class LinkedListCustom<K> {
	
	INode head ;
	INode tail;
	
	public LinkedListCustom() {
		
		this.head = null;
		this.tail = null;
	}

   public void add(INode newNode) {   // newNode is variable
		
		// 56-30-70
		
		// node 70 create karo
		// add 30 and then 56
		
		/*
		 *   head --->70
		 *   
		 *   head -- xxx--->70
		 *   
		 *   head--> [30] ---> 70
		 *   
		 *   head--xxx---> 30 ---> 70
		 *   
		 *   head --> [56] ---> 30 ---->70
		 *   
		 *   
		 */
		
		if(this.tail == null) {
			this.tail = newNode;
		}
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		
			
		}
		
}

	public void dispalyLinkedList(){
		System.out.println("My list"+head);
	}


	
}