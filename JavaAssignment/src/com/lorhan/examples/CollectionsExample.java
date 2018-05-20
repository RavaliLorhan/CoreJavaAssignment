package com.lorhan.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Google");
        list.add("Infosys");
        list.add("Discover");
        list.add("Florida blue");
        
        System.out.println("---------Before adding--------");
		list.forEach(l->System.out.println(l));
		
//		Collections.addAll() method adds all the specified elements to the specified collection.
        Collections.addAll(list,"3M","Cap Gemini");
        System.out.println("---------after adding--------");
		list.forEach(l->System.out.println(l));

	}

}
