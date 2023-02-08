package com.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(110001, "New Delhi");
		map.put(110011, "East Delhi");
		map.put(110058, "West Delhi");
		map.put(110040, "South Delhi");
		
		System.out.println(map);
		System.out.println(map.get(110058));
		
		//To get all the keys
		System.out.println(map.keySet());//[110001, 110040, 110011, 110058]
		//To get all the values
		System.out.println(map.values());//[New Delhi, South Delhi, East Delhi, West Delhi]
		//To get all key and values 
		System.out.println(map.entrySet());//[110001=New Delhi, 110040=South Delhi, 110011=East Delhi, 110058=West Delhi]

		System.out.println("using for each keySet() -------");
		for(Integer key : map.keySet()) {
			System.out.println(key +"=>" +map.get(key));
		}
		
		System.out.println("\nusing for each entrySet() -------");
		for(Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey() +"=>"+entry.getValue());
		}
		
		
	}

}
