package com.ge.interview;


public class InsertionSort {
	
	
	public int[] sort(int[] a, int len){
		
		int index=0;
		int value= 0 ;
		
		for(int i=0; i < len; i++){
			value = a[i];
			index = i;
			
			while(index > 0 && a[index - 1] > value) {
				a[index] = a[index - 1];								 
				index = index - 1;
			}			
			a[index] = value;			
		}
		
		return a;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= new int[] {4,6,8,2,9,8,3};
		a = new InsertionSort().sort(a, a.length);
		
		for(int i =0; i < a.length; i++){
			System.out.println(a[i]+",");
		}
		

	}

}
