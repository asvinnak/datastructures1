package com.ge.interview;

public class QuickSort {
	
	public int[] sort(int[] a, int low, int high){
		
		if(low >= high){
			return a;
		}
		
		int left = low;
		int right= high;
		int mid= left + (right - left)/2;
		int temp;
		
		
		
		while(left <= right){
			
			while( a[left] < a[mid]){
				left++;
			}
			while( a[right] > a[mid]) {
				right--;
			}
			
			if(left <= right){
				temp = a[right];
				a[right] = a[left];
				a[left] = temp;
				left++;
				right--;
			}			
		}
		
		if(low < right){
			sort(a, low, right);
		}
		if(left < high){
			sort(a, left, high);
		}
		
		return a;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] a= new int[] {4,6,8,2,9,8,3};		
		a = new QuickSort().sort(a, 0, a.length -1);
		for(int i =0; i < a.length; i++){
			System.out.println(a[i]+",");
		}
	}

}
