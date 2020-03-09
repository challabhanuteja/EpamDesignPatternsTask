package com.bhanu.factoryMethodPattern;

public abstract class Bill {
	protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
    	getRate();
    	System.out.println(units*rate);  
     }  
}
