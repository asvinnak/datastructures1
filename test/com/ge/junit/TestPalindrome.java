package com.ge.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ge.interview.Palindrome;

public class TestPalindrome {

	@Test
	public void test() {
		
		String s= "malayalam";
		
		Palindrome p = new Palindrome();
		assertTrue(s, p.isPalindrome(s));
		
	}
	
	

}
