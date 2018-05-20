package com.lorhan.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set is an unordered collection of objects and it does not allow duplicates
		Set<Integer> set = new HashSet<>();
		set.add(new Integer(25));
		set.add(new Integer(80));
		set.add(new Integer(50));
		set.add(new Integer(85));
		set.add(new Integer(80));
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
