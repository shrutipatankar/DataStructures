package com.neu.study.datastructures.linkedList;

/**
 * 
 * @author shruti
 * This class represents the data structure of a Linked List
 * The data of the LinkedList depends on the template "T" passed
 * in the class
 */
public class LinkedList<T> {
	
	private Node<T> head;
	
	public LinkedList(T data){
		head = new Node<T>(data);
	}
	
	public void insertNodeAtTheEnd(T data){
		Node<T> newNode = new Node<T>(data); 
		Node<T> temp = head;
		while(temp.getNext()!=null){
			temp = temp.getNext();
		}
		temp.setNext(newNode);
	}
	
	public void insertNodeAtTheBeginning(T data){
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void insertNodeAtPosition(T data, int position){
		
	}
	
	public void printLinkedList(){
		Node<T> temp = head;
		while(temp.getNext()!=null){
			System.out.print(temp.getData() + "\t");
			temp = temp.getNext();
		}
		System.out.println(temp.getData());
	}
}
