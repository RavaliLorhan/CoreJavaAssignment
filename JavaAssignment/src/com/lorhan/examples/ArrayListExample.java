package com.lorhan.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	 public static void main(String[] args) {
		 
		//ArrayList is an ordered Collection and allows duplicates
		List<String> songs = new ArrayList<String>();
		songs.add("Havana");
		songs.add("Trumpets");
		songs.add("Waving flag");
		songs.add("Despacito");
		songs.add("Waving flag");
				
		//Printing the values in list using for-Each loop
		System.out.println("---------Before sorting--------");
		songs.forEach(s->System.out.println(s));
		
		Collections.sort(songs);
		
		//Printing the values in list after sorting
		System.out.println("---------After sorting--------");
		songs.forEach(s->System.out.println(s));
		
		
		
	}
}
