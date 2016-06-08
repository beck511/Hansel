package com.fdmgroup.Hansel;

public class passby {

	
	
	
	public void passX(int x){
		x = x +1;
	}
	
	public void displayX(int x){
		System.out.println(x);
	}
	
	public void passP(Person p){
		p.setAge(10);
	}
	
	public void displayP(Person p){
		System.out.println(p.getAge());
	}
}
