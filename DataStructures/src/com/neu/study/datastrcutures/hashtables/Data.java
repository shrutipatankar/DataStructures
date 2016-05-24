package com.neu.study.datastrcutures.hashtables;
/**
 *
 * @author shruti
 * This class represents the structure of the data
 * stored in the hash table. The class has two data
 * members:
 * 
 * 1. id : unique id for the person name
 * 2. personName : name of a person 
 * 
 * The above data would be stored in a hash table in 
 * the following format:
 * 
 * | ID | PERSONNAME |
 * 
 * See DemoHashTable class for more details
 * 
 */
public class Data {

	private int id;
	private String personName;

	/**
	 * 
	 * @param id : a unique identification number 
	 * @param personName : name of a person
	 */
	Data(int id, String personName) {
		this.id = id;
		this.personName = personName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
