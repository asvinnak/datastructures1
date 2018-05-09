package com.ge.full;

import com.ge.interview.InsertionSort;

public class TestClass {
	
	
	
	public int[] insertionSort(int[] a) {
		int index= 0;
		int val= 0;
		for(int i=1; i < a.length; i++) {
			index= i;
			val= a[i];
			
			while(index > 0 && a[index -1] > val) {
				a[index]= a[index - 1];
				index= index -1;
			}
			a[index] = val;
		}
		
		return a;
		
	}
	
	public int[] bubbleSort(int[] a, int len) {
		
		if(len <= 1) {
			return a;
		}
		int temp;
		
		for(int i=1; i < len; i++) {
			if(a[i] < a[i-1]) {
				temp= a[i-1];
				a[i-1]= a[i];
				a[i]= temp;
			}
		}
		int n= len -1;
		bubbleSort(a, n);
		
		return a;
	}
	
	public int[] quickSort(int[] a, int low, int high) {
		
		if( low > high) {
			return a;
		}
		
		int left= low;		
		int right= high;
		int mid= left + (right - left) /2;
		int temp;
		while( left < right) {
			
			while( a[left] < a[mid]) {
				left ++;
			}
			
			while(a[right] > a[mid]) {
				right--;
			}
			
			if(left <= right) {
				temp= a[right];
				a[right] = a[left];
				a[left]= temp;
				left++;
				right--;
			}
			
		}
		
		if(right > low) {
			quickSort(a, low, right);
		}
		if(left < high) {
			quickSort(a, left, high);
		}
		return a;		
	}
	
	int[] ma= new int[] {4,6,8,2,9,8,3};
	int[] t= new int[ma.length];
	
	public int[] mergeSplitSort(int low, int high) {
		
		if(low < high) {
			return ma;
		}
		int mid= (low + high)/2;
		
		mergeSplitSort(low, mid);
		mergeSplitSort(mid+1, high);
		mergeSort(low, mid, high); 
		
		return ma;		
	}
	
	private void mergeSort(int low, int mid, int high) {
		
		for(int i=low; i <= high; i++) {
			t[i] = ma[i];
		}
		
		int i= low;
		int j= mid+1;
		int k= low;
		
		while(i <= mid && j <= high) {
			
			if(t[j] >= t[i]) {
				ma[k] = t[j];
				j++;
				
			}
			
			else {			
				ma[k] = t[i];
				i++;
				
			}
			
			k++;
			
		}
		
		while(i <= mid) {
			ma[k] = t[i];
			i++;
			k++;
		}
		
	}

	public void display(int[] a) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < a.length; i++){
			sb.append(a[i]+"," );
		}
		System.out.println(sb.toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestClass o = new TestClass();
		int[] a= new int[] {4,6,8,2,9,8,3};
		int[] r;
		System.out.println("Insertion");
		r =o.insertionSort(a);
		o.display(r);
		System.out.println("Bubble");
		r= o.bubbleSort(a, a.length);
		o.display(r);
		
		System.out.println("Quick");
		r= o.quickSort(a, 0, a.length-1);
		o.display(r);
		
		System.out.println("Merge");
		r= o.mergeSplitSort(0, o.ma.length-1);
		o.display(r);
	}

}
