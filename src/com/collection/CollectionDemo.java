package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		System.out.println(list);
		
		//Unique data + insertion order = LinkedHashSet
		//Unique data + sorted order = TreeSet
		//duplicate data + insertion order = ArrayList, LinkedList or Vector
		//duplicate data + sorted order = You have to use Collections.sort() method
		//Collections.sort(list);
		
		System.out.println("------------using for loop-------------");
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("\n------------using while loop-------------");
		int i=0;
		while(i<list.size()) {
			System.out.println(list.get(i));
			i++;
		}
		
		System.out.println("\n------------using for-Each loop-------------");
		for(Integer data:list) {
			System.out.println(data);
		}
		
		System.out.println("\n------------using java 8 forEach() loop-------------");
		list.forEach(data -> System.out.println(data));
		
		System.out.println("\n------------using iterator interface-------------");
		Iterator<Integer> itr = list.iterator(); //next()
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n------------using list iterator interface-------------");
		ListIterator<Integer> listItr = list.listIterator();//previous() & next()
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		while(listItr.hasPrevious()) {
			System.out.println(listItr.previous());
		}
		
		
		
	}

}
