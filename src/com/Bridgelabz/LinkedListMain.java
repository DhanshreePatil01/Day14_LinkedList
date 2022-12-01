package com.Bridgelabz;

public class LinkedListMain  {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------------------Linked List Operations---------------------------\n");
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		
		MyNode<Integer> fNode = new MyNode<Integer>(70);
		MyNode<Integer> sNode = new MyNode<Integer>(30);
		MyNode<Integer> tNode = new MyNode<Integer>(56);
		MyNode<Integer> fourthNode = new MyNode<Integer>(100);
		
		MyNode<Integer> node1 = new MyNode<Integer>(70);
		MyNode<Integer> node2 = new MyNode<Integer>(56);
		MyNode<Integer> node3 = new MyNode<Integer>(30);
		
		
		LinkedListCustom listnew1 = new LinkedListCustom();
		listnew1.add(firstNode);
		listnew1.add(secondNode);
		listnew1.add(thirdNode);
		
		
		
		System.out.println("Linked List Add Method: ");
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		LinkedListCustom listnew2 = new LinkedListCustom();
		listnew2.append(fNode);
		listnew2.append(sNode);
		listnew2.append(tNode);
		
		System.out.println("\nLinked List Append Method: ");
		listnew2.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");

		LinkedListCustom listnew3 = new LinkedListCustom();
		listnew3.add(node1);
		listnew3.add(node2);
		
		System.out.println("\nLinked List Insert Method: ");
		
		listnew3.insert(node2,node3);
		listnew3.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		System.out.println("\nLinked List before deletion:");
		listnew1.dispalyLinkedList();
		
		INode deletedNode=listnew1.pop();
		System.out.println("\nThe node is deleted: "+deletedNode.getKey());
		
		System.out.println("\nLinked List after deletion using pop method:");
		listnew1.dispalyLinkedList();
		System.out.println("---------------------------------------------------------------------------------");
		
		
		
	}
	
	
	
}