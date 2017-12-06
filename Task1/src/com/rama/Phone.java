package com.rama;

public class Phone {

	
	String modelname;
	int releaseyear;
	String memorycapacity;
	String color;
	float cost;
	
	
	
	
	
	public Phone()
	{
		
	}
	
	public Phone(String modelname, int releaseyear, String memorycapacity, String color,float cost) {
		this.modelname = modelname;
		this.releaseyear = releaseyear;
		this.memorycapacity = memorycapacity;
		this.color = color;
		this.cost = cost;
	}
	
	public static boolean IsValidColor(String Color)
	{
		if(Color== "Black" || Color == "Silver" || Color == "White")
			return true;
		else
			return false;
	}
	
}
