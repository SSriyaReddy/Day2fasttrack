package com.day2;

import java.util.Scanner;

public class Program4 {
	  public static void main(String[] args) {
		    // creates an object of Scanner
		    Scanner input = new Scanner(System.in);
		    System.out.print("Enter your name: ");
		    // reads the entire word
		    String value = input.next();
		    System.out.println("Using next(): " + value);
		    input.close();
		  }


}
