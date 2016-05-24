package com.neu.study.datastrcutures.hashtables;

/**
 * 
 * @author shruti
 * This class uses the methods of DemoHashTable
 * to demonstrate the working of Hash Table
 * 
 */
public class DemoHashTableRunner {

	public static void main(String args[]){
		
		DemoHashTable demoHashTable = new DemoHashTable();
		
		// insert data into the hash table
		demoHashTable.insertValue(1, "Shruti");
		demoHashTable.insertValue(2, "Sarthak");
		demoHashTable.insertValue(3, "Shreya");
		demoHashTable.insertValue(4, "Ruta");
		demoHashTable.insertValue(5, "Manasi");
		demoHashTable.insertValue(6, "Edna");
		demoHashTable.insertValue(7, "Donovan");
		demoHashTable.insertValue(8, "Denise");
		demoHashTable.insertValue(9, "Rodolfo");
		demoHashTable.insertValue(10, "Rasika");
		demoHashTable.insertValue(11, "Saket");
		demoHashTable.insertValue(12, "Satish");
		demoHashTable.insertValue(13, "Yogita");
		demoHashTable.insertValue(14, "Catherine");
		demoHashTable.insertValue(15, "Katie");
		demoHashTable.insertValue(16, "Jessie");
		demoHashTable.insertValue(17, "Rebacca");
		demoHashTable.insertValue(18, "Danni");
		demoHashTable.insertValue(19, "Mike");
		demoHashTable.insertValue(20, "Pheobe");
		demoHashTable.insertValue(21, "Monica");
		demoHashTable.insertValue(22, "Racheal");
		demoHashTable.insertValue(23, "Chandler");
		demoHashTable.insertValue(24, "Joey");
		demoHashTable.insertValue(25, "Josphine");
		demoHashTable.insertValue(26, "Ross");
		demoHashTable.insertValue(27, "Russ");
		demoHashTable.insertValue(28, "Pete");
		demoHashTable.insertValue(29, "Frankline");
		demoHashTable.insertValue(30, "Dominique");
		
		
		// display data of the hash table
		demoHashTable.displayHashTable();
		
		// search in the hash table
		System.out.println("\n\nSearching records..");
		System.out.println("Key: 5 Value Found: " + demoHashTable.search(5));
		System.out.println("Key: 30 Value Found:" + demoHashTable.search(30));
		System.out.println("Key: 32 Value Found:" + demoHashTable.search(32));
	}
}
