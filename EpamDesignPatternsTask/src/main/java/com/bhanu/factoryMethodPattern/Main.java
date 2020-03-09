package com.bhanu.factoryMethodPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner klu = new Scanner(System.in);
		System.out.print("Enter the bill type:");
		String billType = klu.next();
		int noOfUnits = klu.nextInt();
		BillCreator billCreator= new BillCreator();
		Bill billObj = billCreator.getBillObj(billType);
		billObj.calculateBill(noOfUnits);
	}

}
