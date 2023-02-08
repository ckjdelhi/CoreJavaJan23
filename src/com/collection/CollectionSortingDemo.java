package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/*
 * Custom sorting..
 * 1. Comparable Interface: default sorting on one field only
 * 2. Comparator Interface: custom sorting
 */
public class CollectionSortingDemo {

	public static void main(String[] args) {
		ArrayList<Student> studentList=new ArrayList<>();
		Student s1=new Student(105, "Chandan", "India");
		Student s2=new Student(104, "Ram", "US");
		Student s3=new Student(101, "Ajay", "UK");
		Student s4=new Student(102, "Mohan", "Japan");
		Student s5=new Student(103, "Shohan", "Nepal");
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s1);
		studentList.add(s3);
		System.out.println("Before Sorting.....................");
		for(Student s:studentList) {
			System.out.println(s.getId()+" "+ s.getName()+" "+s.getCountry());
		}
		
		System.out.println("\nAfter sorting: default sorting(name).....................");
		
		Collections.sort(studentList);
		
		for(Student s:studentList) {
			System.out.println(s.getId()+" "+ s.getName()+" "+s.getCountry());
		}
		
		System.out.println("\nAfter sorting: by Country ASC.....................");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getCountry().compareTo(o2.getCountry());
			}
		});
		for(Student s:studentList) {
			System.out.println(s.getId()+" "+ s.getName()+" "+s.getCountry());
		}
		
		System.out.println("\nAfter sorting: by id DESC.....................");
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				//return String.valueOf(o2.getId()).compareTo(String.valueOf(o1.getId()));
				return o2.getId() - o1.getId();
			}
		});
		for(Student s:studentList) {
			System.out.println(s.getId()+" "+ s.getName()+" "+s.getCountry());
		}
		
		
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(40);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(20);
		System.out.println("\nBefore Sorting.....");
		System.out.println(list);
		
		//TreeSet<Integer> set=new TreeSet<>(list);
		//System.out.println(set);
		
		
		Collections.sort(list);
		System.out.println("\nAfter Sorting ASC.....");
		System.out.println(list);
		
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("\nAfter sorting DESC...");
		System.out.println(list);
		
		
		
	}

}
