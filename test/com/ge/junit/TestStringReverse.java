package com.ge.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ge.interview.StringReverse;

public class TestStringReverse {

	@Test
	public void test() {
		String s= "Aswanikumar";		
		StringReverse c = new StringReverse();
		String r = c.reverse(s);
		
		assertTrue(s, !s.equalsIgnoreCase(r));	
				
	}
	
	
	@Test
	public void reverseNumber(){
		String sNumber= "734";
		
		StringReverse c = new StringReverse();
		String r= c.numberReverse(sNumber);
		System.out.println("Rev Numebr "+ r);
		assertTrue("Reverse :"+sNumber,  sNumber.equalsIgnoreCase(r));
		
	}
	
	

}
