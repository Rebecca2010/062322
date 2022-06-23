package com.revature.collect.assign;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assign1 {
public static void main(String[] args) {
	
	Set <String> mySet = new HashSet<String>();
	mySet.add("Jannabi");
	mySet.add("Onewe");
	mySet.add("Dvwn");
	
	// Iterations
	for(String s : mySet)
		System.out.println("Group Name: " + s);
	
	List<String> myList=new ArrayList<String>();
	myList.add("Good Good Night");
	myList.add("Rain To Be");
	myList.add("Last");
	
	//Iterations
	for(String l : myList)
		System.out.println("Song Name: " + l);
		
}
}
