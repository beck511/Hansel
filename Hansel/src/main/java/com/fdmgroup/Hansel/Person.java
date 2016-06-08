package com.fdmgroup.Hansel;

public class Person {
//state
	private String name;
	private int age;
	
	
public Person(){
	name = "I have no name yet";
}

public Person(String name){
	this.name = name;
	
}
public Person(String s, int a){
	name = s;
	age = a;
}
	
	public int getAge() {
		return age;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	//Behaviours
	public void eat(){
		System.out.println("I like to eat");
	}
public void sleep(){
		System.out.println("I like to sleep");
	}
public void talkOutLoud(){
	System.out.println("I like to talk out loud");
	
}
	
	
}

