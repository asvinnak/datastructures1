package com.ge.interview;

import java.util.Scanner;

public class PrintTwenty {
	
	
	public String A = "********************";
	final int MAX_SIZE= A.length(); 
	
	
	public void draw(String s){		
		
		int first=0;
		int last= 0;
		
		//Astrix to be displayed total in line
		int total= MAX_SIZE - s.length();
		
		for(int i=0; i <= total * 2; i++){
			
			last= Math.abs( total - i);			
			first= total - last;
					
			
			//System.out.println(A.substring(0,first) + s + A.substring(0, last));
			
			System.out.println(A.substring(0,last) + s + A.substring(0, first));
			
		}
		
	}
		
		public void drawVShape(String s){		
			
			int first=0;
			int mid= 0;
			int last= 0;
			
			int inputLen= s.length() * 2;
			//Astrix to be displayed total in line
			int total= MAX_SIZE - inputLen;
			
			for(int i=0; i <= total/2; i++){
				
				mid= Math.abs( total - i);				
				first= total - mid;
				last= total-mid;
				mid= mid - last;
						
				
				//System.out.println(A.substring(0,first) + s + A.substring(0, last));
				if(i == total/2){
					first= first + s.length()/2;
					last= last + s.length()/2;
					System.out.println(A.substring(0,first) + s + A.substring(0, last));
				}
				else{
					System.out.println(A.substring(0,first) + s + A.substring(0, mid) + s + A.substring(0,last));
				}
				
			}		
		
		
		}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Enter Name:");
		Scanner sc= new Scanner(System.in);
		
		String s = "Aswani"; //sc.toString();
		
		PrintTwenty p= new PrintTwenty();
		//p.draw(s);
		p.drawVShape(s);
		

	}

}
