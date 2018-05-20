 package com.lorhan.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		//HashMap is a Collection of objects which stores data in key-value format
		Map<Integer, String> rollNoAndNames = new HashMap<>();
		rollNoAndNames.put(101, "Ankitha");
		rollNoAndNames.put(102, "Deepthi");
		rollNoAndNames.put(103, "Srujana");
		rollNoAndNames.put(104, "Vathsalya");
		rollNoAndNames.put(105, "Varsha");
		rollNoAndNames.put(102, "Ravali");
		
		Set<Integer> keySet = rollNoAndNames.keySet();
		Iterator<Integer> it = keySet.iterator();
		while(it.hasNext())
		{
			Integer key = it.next();
			String value = rollNoAndNames.get(key);
			System.out.println(key+" = "+value);
		}
		

	}

}
