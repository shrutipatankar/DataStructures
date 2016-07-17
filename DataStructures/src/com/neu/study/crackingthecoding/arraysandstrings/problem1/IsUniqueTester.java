package com.neu.study.crackingthecoding.arraysandstrings.problem1;

public class IsUniqueTester {

	public static void main(String[] args) {
		IsUnique isUnique = new IsUnique();
		System.out.println(isUnique.isUniqueString("abbc"));
		System.out.println(isUnique.isUniqueString("abcd"));
		System.out.println(isUnique.isUniqueString("abcc"));
		System.out.println(isUnique.isUniqueString(""));
		System.out.println(isUnique.isUniqueString(null));
	}
}
