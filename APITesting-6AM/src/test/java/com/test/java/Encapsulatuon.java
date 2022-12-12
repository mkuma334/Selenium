package com.test.java;

public class Encapsulatuon {
 
	private String name;
	
	public String setMassage()
	{
		System.out.println("name ");
		return name;
	}
	
	public void getMessage(String name )
	{
		this.name=name;
		
		System.out.println(name);
	}
}
