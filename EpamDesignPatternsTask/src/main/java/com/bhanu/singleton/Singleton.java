package com.bhanu.singleton;

public class Singleton {

	private static Singleton obj=null;
	private Singleton()
	{
		System.out.println("object created");
	}
	static Singleton getObject()
	{
		if(obj==null)
		{
		   obj=new Singleton();	
		}
		return obj;
	}
}
