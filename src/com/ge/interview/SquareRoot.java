package com.ge.interview;

import java.util.Scanner;

public class SquareRoot {
	
	public double getSquareRootValue(double x){
		
		double result=0d;
		int i=0;
		while(true){			
			if(i * i >= x){
				break;
			}
			i++;			
		}
		result = i - 1;
		result = x/i;
		result=(result+i)/2;
		
		return result;		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SquareRoot o = new SquareRoot();
		
		System.out.println("Find Sqrt for number:");		
		Scanner s = new Scanner(System.in);
		double x= s.nextDouble();
		double r= o.getSquareRootValue(x);
		
		System.out.println(Math.sqrt(x));
		
		System.out.println("Result : "+ r);


	}

}
