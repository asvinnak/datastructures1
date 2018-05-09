package com.ge.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindOccurancesOfLetters {
	
	
	int highest= 0;
	char highOccuranceChar;
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	
	public void highOccurances(String s){
		
		for(int i=0, len = alpha.length(); i < len; i++ ){	
			int occurance=0;
			for(int j=0, len1= s.length(); j < len1; j++ ){
				if(alpha.charAt(i) == s.charAt(j)){
					occurance++;
					if(occurance > highest ){
						highest = occurance;
						highOccuranceChar= s.charAt(j);
					}
				}
			}			
		}
		
	}
	

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("Enter Input: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input= br.readLine();
		
		FindOccurancesOfLetters o = new FindOccurancesOfLetters();
		o.highOccurances(input);
		
		System.out.println(o.highest);
		System.out.println("Char :"+ o.highOccuranceChar);
		

	}

}
