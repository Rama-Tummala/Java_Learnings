package com.rama;

import java.util.Scanner;

public class TestOrder extends Order

{
	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner(System.in);
		
		Order order1= new Order();
		System.out.println("Enter the details of the Phone yoou want..Modelname");
		order1.modelname = user_input.next();
		System.out.println("release year");
        order1.releaseyear= user_input.nextInt();
        System.out.println("memorycapacity");
        order1.memorycapacity= user_input.next();
        System.out.println("color and cost");
        order1.color = user_input.next();
        order1.cost = user_input.nextFloat();
	    order1.ProcessOrder("rama","12345");
	    System.out.println("Your Iphone color is "+ order1.color);
	}




	
}
