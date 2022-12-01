package com.Bridgelabz;

public class LinkedListMain  {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------Linked List Operations---------------------------\n");
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
//		
//		MyNode<Integer> fNode = new MyNode<Integer>(70);
//		MyNode<Integer> sNode = new MyNode<Integer>(30);
//		MyNode<Integer> tNode = new MyNode<Integer>(56);
//		MyNode<Integer> fourthNode = new MyNode<Integer>(100);
//		
//		
		LinkedListCustom listnew1 = new LinkedListCustom();
		listnew1.add(firstNode);
		listnew1.add(secondNode);
		listnew1.add(thirdNode);
		
		System.out.println("Linked List Add Method: ");
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		
	}
	
	
	
}