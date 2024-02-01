package com.arun.main;

public class School {
	
	
	public static void main(String args[])
	{
		Pen p=new PenAdapter();
		Assignment assign1=new Assignment();
		assign1.setP(p);
		assign1.writeAssignment("I am Arun Amballa");
		
	}
	

}
