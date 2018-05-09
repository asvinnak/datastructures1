package com.ge.interview;

public class BubbleSorting {
	
	public int[] sort(int[] a, int len){
		
		if(len <= 1)
			 return a;
		
		int temp;
		int n= len;
		for(int i=1; i < len; i++) {
			if(a[i] < a[i -1]){
				temp = a[i - 1];
				a[i - 1] = a[i];
				a[i] = temp;
			}			
		}	
		n = n - 1;
		
		sort(a, n);
		
		return a;		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= new int[] {4,6,8,2,9,8,3};
		a = new BubbleSorting().sort(a, a.length);
		
		for(int i =0; i < a.length; i++){
			System.out.println(a[i]+",");
		}

	}

}
