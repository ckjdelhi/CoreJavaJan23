package com.collection;

import java.util.*;

/*package is java.util.*
 * Collection(i): Group of object
 * 1. List(i): duplicate data
 * 	a. ArrayList(c): duplicate data, insertion order, not sync(thread safe), array data structure, fetching
 * 	b. LinkedList(c):duplicate data, insertion order, not sync(thread safe), doubly linked list data structure, delete/update
 * 	c. Vector(c): duplicate data, insertion order, sync(thread safe)
 * 
 * 2. Set(i): unique data
 * 	a. HashSet(c): unique data, UnOrdered, not sync(thread safe)
 * 	b. LinkedHashSet(c):unique data, insertion Ordered, not sync(thread safe)
 * 	c. TreeSet(c): unique data, Sorted(natural order), not sync(thread safe)
 * 
 * 3. Queue(i): duplicate data, Queue, Stack
 * 	a. LinkedList(c): duplicate data, insertion order, not sync(thread safe)
 * 	b. PriorityQueue(c): duplicate data, Queue(FIFO), Stack(LIFO)
 * 
 * Map(i): key-value pair
 * 1. HashMap(c): key-value pair, unique key, UnOrdered, not sync(thread safe)
 * 2. LinkedHashMap(c): key-value pair, unique key, insertion order, not sync(thread safe)
 * 3. TreeMap(c): key-value pair, unique key, Sorted(natural order), not sync(thread safe)
 * 4. Hashtable(c): key-value pair, unique key, UnOrdered, sync(thread safe)
 */

public class Demo {

	public static void main(String[] args) {
		System.out.println("------------LIST---------------");
		//ArrayList list=new ArrayList();
		//LinkedList list=new LinkedList();
		Vector<String> list=new Vector<>();
		list.add("chandan");
		list.add("Madhu");
		list.add("chandan");
		System.out.println(list);
		
		System.out.println("\n------------SET---------------");
		//HashSet<String> setObj=new HashSet<>();
		//LinkedHashSet<String> setObj=new LinkedHashSet<>();
		TreeSet<String> setObj=new TreeSet<>();
		setObj.add("Ram");
		setObj.add("Mohan");
		setObj.add("Chandan");
		setObj.add("Ram");
		setObj.add("Mohan");
		setObj.add("Cjk");
		System.out.println(setObj);
		
		System.out.println("\n------------MAP---------------");
		//HashMap<String, String> map=new HashMap<>();
		//LinkedHashMap<String, String> map=new LinkedHashMap<>();
		TreeMap<String, String> map=new TreeMap<>();
		map.put("name", "Chandan");
		map.put("country", "India");
		map.put("course", "Java");
		System.out.println(map);
	}

}
