package com.fdmgroup.Hansel;

public class Woodcutter extends Person {
	

	public void cutWood() {
	System.out.println("Cutting wood in a general way");
		
	}
		
	public void cutWood(int i) {
			System.out.println("Cutting " + i + " Pieces of wood");
			
		}

	public void cutWood(int i, String s) {
	System.out.println("Cutting " + i + " pieces of wood because" + s + " asked me to");
		
	}
	
	

@Override
public void talkOutLoud(){
	System.out.println("Talking quietly");
	}


public Woodcutter(){
//	name = s;
//	age = a;
}
}