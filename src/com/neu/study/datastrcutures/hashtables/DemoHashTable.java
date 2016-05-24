package com.neu.study.datastrcutures.hashtables;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * @author shruti
 * This class represents a very simple hash table of capacity 10
 * It has a hashTableArray in which the data is stored
 * in the following format:
 * 
 * | 0 | 1 | 2 | 3 | 4 |
 *   ^   ^   ^   ^   ^
 *   |   |   |   |   |
 *  |_| |_| |_| |_| |_|
 *   |   |   |   |   |
 *  |_| |_| |_| |_| |_|
 *   |   |   |   |   |
 *  |_| |_| |_| |_| |_|  
 *  
 *  The hashTableArray is an array of linked lists
 *  Each array element is a reference to a linked list
 *  Each linked list has a node in which data is stored
 *  Linked list node -> Data class instance
 */
public class DemoHashTable {

	LinkedList<Data>[] hashTableArray;
	int hashTableCapacity;

	@SuppressWarnings("unchecked")
	DemoHashTable() {
		hashTableCapacity = 10;
		hashTableArray = new LinkedList[hashTableCapacity];
	}

	/**
	 * 
	 * @param key   : unique integer id 
	 * @param value : String value related to the id
	 * This method inserts a value into the hash table.
	 * A hashing function is used on the key to decide
	 * where to insert the data into the hash table
	 */
	public void insertValue(int key, String value) {
		Data employee = new Data(key, value);
		if (hashTableArray[getHashValue(key)] == null) {
			LinkedList<Data> employees = new LinkedList<Data>();
			employees.add(employee);
			hashTableArray[getHashValue(key)] = employees;
		} else {
			LinkedList<Data> employees = hashTableArray[getHashValue(key)];
			employees.add(employee);
		}
	}

	/**
	 * 
	 * @param key
	 * @return an integer which is a modulo 10 of the key
	 * This is a very simple hashing function which accepts 
	 * an integer key and returns the modulo 10 of the key
	 * Example: 
	 * Key -> 11
	 * return 1 (11 mod 10)
	 */
	private int getHashValue(int key) {
		return (key % hashTableCapacity);
	}

	/**
	 * 
	 * @param key
	 * @return the value of the key
	 * This method accepts the integer key, uses a hash function
	 * on the key to find the position of the data in the hash 
	 * table and only traverses through the linked list at the 
	 * that position in the array to return the value of the key
	 */
	public String search(int key) {
		LinkedList<Data> temp = hashTableArray[getHashValue(key)];
		ListIterator<Data> listIterator = temp.listIterator();
		while (listIterator.hasNext()) {
			Data employee = listIterator.next();
			if(employee.getId() == key){
				return employee.getPersonName();
			}
		}
		return "No record for id: " + key;
	}

	/**
	 * This method displays the contents of the hash table
	 */
	public void displayHashTable() {
		for (int i = 0; i < hashTableArray.length; i++) {
			System.out.println("At position: " + i);
			LinkedList<Data> temp = hashTableArray[i];
			ListIterator<Data> listIterator = temp.listIterator();
			while (listIterator.hasNext()) {
				Data employee = listIterator.next();
				System.out.println(employee.getPersonName());
			}
		}
	}
}
