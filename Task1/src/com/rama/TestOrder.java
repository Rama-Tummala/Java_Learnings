package com.rama;

import java.util.Scanner;

public class TestOrder extends Order

{
	public static void main(String[] args) {
		
		
		Scanner user_input = new Scanner(System.in);
		
		Order order1= new Order();
		order1.modelname = user_input.next();
        order1.releaseyear= user_input.nextInt();
        order1.memorycapacity= user_input.next();
        order1.color = user_input.next();
        order1.cost = user_input.nextFloat();
	    order1.ProcessOrder("rama","12345");
	    System.out.println("Your Iphone color is "+ order1.color);
	}




	
}
