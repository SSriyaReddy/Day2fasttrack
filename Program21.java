package com.day2;

public class Program21 {
	public static void main(String args[]) 
	{
	 
	InstanceDemo id = new InstanceDemo();
	 //Instance method is being called using the object of the class
	id.callme();
	 //Static variable is accessed with the class name
	System.out.println("The value of a = " + InstanceDemo.a);
	System.out.println();

	}


}
