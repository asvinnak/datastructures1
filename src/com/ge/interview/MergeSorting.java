package com.ge.interview;

public class MergeSorting {
	
	int[] a= new int[] {4,6,8,2,9,8,3};
	int[] t= new int[a.length];
	
	public void sort(int low, int high) {		
		if(low < high) {		
			int mid = low + (high - low) / 2;
			sort(low, mid);
			sort(mid+1, high);		
			mergeSorting(low, mid, high);	
		}
	}
	
	public void mergeSorting(int low, int mid, int high){
		
		for(int j=0; j < a.length; j++){
			t[j] = a[j];
		}
		
		int i= low;
		int k= low;
		int j= mid+1;
		
		while( i <= mid && j <= high) {			
			if(t[i] < t[j]){
				a[k]= t[i];
				i++;				
			}
			else{
				a[k]= t[j];
				j++;								
			}				
			k++;
		}
		
		while( i <= mid){
			a[k] = t[i];
			i++;
			k++;
		}
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		MergeSorting o = new MergeSorting();
		o.sort(0, o.a.length -1);
		
		for(int i=0, len = o.a.length; i < len; i++){
			System.out.println(o.a[i] + ",");			
		}
	}

}
