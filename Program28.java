package com.day2;

public abstract class Program28 {
	abstract int getRateOfInterest();    
	}    
	class SBI extends Program28{    
	int getRateOfInterest(){return 7;}    
	}    
	class PNB extends Program28{    
	int getRateOfInterest(){return 8;}    
	}    
	    
	class TestBank{    
	public static void main(String args[]){    
		Program28 p;  
	p=new SBI();  
	System.out.println("Rate of Interest is: "+p.getRateOfInterest()+" %");    
	p=new PNB();  
	System.out.println("Rate of Interest is: "+p.getRateOfInterest()+" %");    
	}

}
