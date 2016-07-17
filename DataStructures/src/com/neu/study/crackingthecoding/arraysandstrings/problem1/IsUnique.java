package com.neu.study.crackingthecoding.arraysandstrings.problem1;

import java.util.Arrays;

/**
 * This problem is from the book Cracking the Coding Interview 6th Edition
 * 
 * @author shruti
 * 
 *         Problem 1.1 : Is Unique Implement an algorithm to determineif a
 *         string has all unique characters. What of you cannot use additional
 *         data structures?
 * 
 *         Examples: "abcd" -> true "abbc" -> false "" ->
 *         "Please enter a valid input" null -> "Please enter a valid input" "a"
 *         -> true "abcc" -> false // char repeated at the end
 * 
 *         Questions: 
 *         1. Can the string have special characters like :, *, % ?
 *         2. Can the string be empty ?
 *         3. is Aa same?
 *         
 *         Assumptions:
 *         1. special chars are allowed
 *         2. An empty string is an invalid input
 *         3. Aa are same
 *         
 */
public class IsUnique {

	char[] strArray;

	IsUnique() {
	}

	/**
	 * 
	 * @param str
	 *            Input string which is to be checked for unique characters
	 * @return : An output message or true/false
	 */
	public String isUniqueString(String str) {
		if (str == null || str == "") {
			return "Please enter a valid input";
		} else {
			return String.valueOf(checkAllCharsForUniqueness2(str));
		}
	}

	/*
	 * Solution 1 traverses through the char array and compares 
	 * current letter with each letter after current letter
	 * Big(O) = O(n^2) time and O(1) space
	 */
	private boolean checkAllCharsForUniqueness1(String str) {
		strArray = str.toCharArray();
		for (int i = 0; i < strArray.length - 1; i++) {
			for (int j = i + 1; j < strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					return false;
				}
			}
		}
		return true;
	}

	/*
	 * Solution 2 traverses through the char array and performs 
	 * bitwise manipulation on bits of a single integer
	 * Big(O) = O(n) time 1
	 * Assumption : Only lower case letter strings are used
	 */
	private boolean checkAllCharsForUniqueness2(String str) {
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			System.out.println(val);
			if ((checker & (1 << val)) > 0) {
				return false;
			}
			checker |= (1 << val);
		}
		return true;
	}

	/*
	 * Solution 3 first sorts the array and then traverses through 
	 * the array to check if there is repetition of chars
	 * Big(O) = O(n log(n)) time and space will be more due to sorting  
	 */
	private boolean checkAllCharsForUniqueness3(String str) {
		strArray = str.toCharArray();
		Arrays.sort(strArray);
		for (int i = 0; i < strArray.length - 1; i++) {
			if (strArray[i] == strArray[i + 1])
				return false;
		}
		return true;
	}

	/*
	 * Solution 4 traverses through the char array only once 
	 * and sets the boolean flags true in another array
	 * Big(O) = O(n) time and space is O(c), where c is the size of
	 * char array set
	 */
	private boolean checkAllCharsForUniqueness4(String str) {
		boolean[] alphabets = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			int position = str.charAt(i);
			if (alphabets[position])
				return false;
			alphabets[position] = true;
		}
		return true;
	}

}
