package com.ge.interview;

import java.util.ArrayList;
import java.util.List;

public class FindOccurancesInTwoArray {
	
	int[] a= new int[] { 2, 4, 5, 5, 9};
	int[] b= new int[] { 3, 5, 5, 9, 12};
	List<Integer> matchList= new ArrayList<Integer>();
	
	public void findOccurancesInArray(){
		
		int i=0;
		int j=0;
		
		int aLen= a.length;
		int bLen= b.length;
		int lastmatched=0;
		
		while( i < aLen && j < bLen){			
			if(a[i] == b[j] && lastmatched != a[i]) {				
				matchList.add(a[i]);
				lastmatched= a[i];
				i++;
				j++;
			}
			else if(a[i] <b[j]){
				i++;
			}
			else{
				j++;
			}
			
		}
		
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FindOccurancesInTwoArray o = new FindOccurancesInTwoArray();
		o.findOccurancesInArray();
		for(int i : o.matchList){
			System.out.println(" matched Number ="+ i);
		} 

	}

}
