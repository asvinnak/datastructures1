package com.ge.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ge.interview.PrimeNumber;

public class TestPrimeNumber {

	PrimeNumber p;
	
	@Before
	public void initialize(){
		p = new PrimeNumber();
	}
	
	@Test
	public void isPrime() {	
		
		assertTrue(p.isPrime(18));
		
	}
	
	@Test
	public void primeNumbers(){
		
	 	p.primeNumbers(20);	 	 	
	}
	
	@Test
	public void converStringToNumner(){
		p.convertStringToNumber("23456");
		
	}
	
	
	
	@After
	public void destroy(){
		p = null;
	}

}
