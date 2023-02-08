package com.collection;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private String country;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	/*
	 * +ve = big 
	 * -ve = small
	 * 0 = same
	 */
	//A, B => 65-66 = -1
	@Override
	public int compareTo(Student o) {
		//return o.id - this.id; //sort using id DESC
		return this.getName().compareTo(o.getName());//name, ASC
	}
	
}
