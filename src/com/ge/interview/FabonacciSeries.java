package com.ge.interview;

import java.io.IOException;

public class FabonacciSeries {
	
	
	public long fabonacci(int num){
		
		if(num <= 1)
			return num;
		
		int x = 0, y = 1, sum=0;
		long total= 0L;
		for(int i = 0; i < num; i++){
			
			sum = x + y;			
			System.out.println(sum);
			x = y;
			y = sum;
			
			total = total + sum;
			
		}
		
		System.out.println("toatl :"+ total);
		 return  total;
		
		
	}
	
	public int fabrec(int n){
		
		if(n == 0 || n == 1)
			return n;
		
		return fabrec(n-1) + fabrec(n-2);
		
	}
	
	public static void main(String args[]) throws IOException {
		
		FabonacciSeries f= new FabonacciSeries();
		long st = System.nanoTime();
		f.fabonacci(5);
		long et= System.nanoTime();
		
		
		
	}

}
