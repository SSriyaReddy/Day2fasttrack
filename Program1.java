package com.day2;

import java.util.Scanner;

public class Program1 {
	  public static void main(String[] args) {
	    // creates an object of Scanner
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your name: ");
	    // takes input from the keyboard
	    String name = input.nextLine();
	  // prints the name
	    System.out.println("My name is " + name);
	    // closes the scanner
	    input.close();
	  }


}
