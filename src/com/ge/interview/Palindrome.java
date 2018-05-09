package com.ge.interview;

public class Palindrome {
	
	public boolean isPalindrome(String s){
		boolean isPalindrome = true;
		int l= s.length();
		char[] ch= s.toCharArray();
		
		for(int i=0, j=l-1; i < l/2; i++, j-- ){
			
			if(ch[i] != ch[j]){
				isPalindrome = false;
				break;
			}						
		}		
		
		return isPalindrome;	
	}

}
