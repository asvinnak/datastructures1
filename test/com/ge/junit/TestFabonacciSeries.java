package com.ge.junit;

import org.junit.Test;

import com.ge.interview.FabonacciSeries;

public class TestFabonacciSeries {
	
	
	
	@Test
	public void test(){
		FabonacciSeries f= new FabonacciSeries();
		long st = System.nanoTime();
		long t=f.fabonacci(4);
		long et= System.nanoTime();
		System.out.println("For loop :"+ (et - st));
		System.out.println(t);
		
		st = System.nanoTime();
		t= f.fabrec(4);
		et= System.nanoTime();
		System.out.println("Recursion :"+ (et - st));
		System.out.println(t);
		
	}

}
