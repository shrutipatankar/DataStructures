package com.neu.study.datastructures.linkedList;

public class LinkedListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> intLinkedList = new LinkedList<Integer>(1);
		intLinkedList.insertNodeAtTheEnd(2);
		intLinkedList.insertNodeAtTheEnd(3);
		intLinkedList.insertNodeAtTheBeginning(4);	
		intLinkedList.printLinkedList();

		// throw an exception if an empty string is received
		LinkedList<String> strLinkedList = new LinkedList<String>("mugdha");
		strLinkedList.insertNodeAtTheEnd("shruti");
		strLinkedList.insertNodeAtTheEnd("manasi");
		strLinkedList.insertNodeAtTheBeginning("ruta");
		strLinkedList.printLinkedList();		
	}
}
