package com.day2;

public class Program27 {
	    int number;
	    public Program27(int x) {
	        System.out.println("Parameterized Constructor Called");
	        number=x;
	    }
	   
	    public static void main(String[] args) {
	        
	    	Program27 obj = new Program27(4); // Parameterized Constructor Called
	        System.out.println("Number value is: "+obj.number);
	    }  

}
