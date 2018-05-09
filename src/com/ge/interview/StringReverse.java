package com.ge.interview;


public class StringReverse {
	
	

	public String reverse(String s){
		
		char rev[] = s.toCharArray();
		char temp;
		int len= s.length();
		
		for(int i=0, j=len-1; i < len/2; i++, j-- ){
			temp = rev[i];
			rev[i] = rev[j];
			rev[j] = temp;
		}
		
		return new String(rev);
	}	
	
	
	public String numberReverse(String s){
		
		int d= Integer.valueOf(s).intValue();		
		int q=0; 
		int sum= 0;
		
		while( d != 0){
			q = d % 10;
			d = d/10;
			sum = sum * 10 + q;			
			
		}
		
		return new String(String.valueOf(sum));
		
	}
	
	public void strReverse() {
		int[] a= {1,2,3};
		int l= a.length;
		
		for(int i=0; i < l/2; i++) {
			a[i] = a[i] - a[l-1-i]; // num1= num1 - num2 ( 1 - 3) = -2
			
			a[l-1-i] = a[l-1-i] + a[i]; //num2= num2 + num1 (3 + -2) = 1
			a[i] = a[l-1-i] - a[i]; //num1= num2 - num1  (1 - -2) = 3
			
			
		}
		
		System.out.println(a);		
	}
	
	public void strReverse1() {
		String str = "The quick brown fox jumps over the lazy dog";

	    int len = str.length();
	    for (int i = (len-1); i >= 0; --i) {
	        str += str.charAt(i);
	    }
	    str = str.substring(len);

	    System.out.println(str);
	}
	
	
	public static void main(String[] s) {
		
		StringReverse o = new StringReverse();
		o.strReverse1();
	}
}
