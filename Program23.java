package com.day2;

public class Program23 {
		
		// This method is hidden by display() in Base
	    public static void display() {
	         System.out.println("Static or class method from Derived");
	    }
	     
	    // This method overrides print() in Base
	    public void print() {
	         System.out.println("Non-static or Instance method from Derived");
	   }




}
