package com.bhanu.singleton;

public class Runner {

	public static void main(String[] args)
	{
		Singleton obj=Singleton.getObject();
		Singleton obj1=Singleton.getObject();
		Singleton obj2=Singleton.getObject();
	}
}
