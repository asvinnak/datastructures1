package com.ge.junit;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class TestSort {
	
	
	private int[] insertionSort(int[] a) {			
		int len = a.length;	
		int index= 0;
		int currentValue= 0;
		
		for(int i=1; i < len; i++) {
			index= i;
			currentValue= a[i];			
			while( index > 0 && a[index - 1] > currentValue ) {
				a[index] =  a[index - 1];
				index = index-1;		
			}
			a[index] = currentValue;		
		}		
		return a;			
	}
	
	
	private int[] bubbleSort(int[] a,int len) {
		
		if(len <= 1) {
			return a;
		}
		
		int n= len;
		int temp= 0;
		for(int i=1; i<n; i++ ) {
			if(a[i] < a[i-1]) {
				temp= a[i-1];
				a[i-1]= a[i];
				a[i]= temp;
			}
		}
		
		n= n-1;
		bubbleSort(a, n);
		return a;
	}
	
	private int[] quickSort(int[] a, int low, int high) {
		
		if(low >= high) {
			return a;
		}
		
		int left= low;
		int right= high;
		int pivot= left + (right-left)/2;
		
		while(left <= right) {			
			while(a[left] < a[pivot]) {
				left ++;
			}
			
			while(a[right] > a[pivot]){
				right --;
			}
			
			if(left <= right) {
				int temp= a[left];
				a[left] = a[right];
				a[right]= temp;
				left++;
				right--;				
			}			
		}
		
		if(low < right) {
			quickSort(a, low, right);
		}
		if(left < high){
			quickSort(a, left, high);
		}
		
		return a;		
	}
	
	public int[] b = { 8, 5, 3, 7, 5, 4, 9, 2 };	
	public int[] t= new int[b.length];
	
	private void mergeSort( int low, int high) {
		
		if(low < high) {	
			int mid= (low+high)/2;			
			mergeSort(low, mid);
			mergeSort(mid+1, high);
			sort(low, mid, high);
		}
	}
	
	private void sort(int low, int mid, int high) {
		
		for(int i=low; i <= high; i++) {
			t[i] = b[i];
		}
		
		int j= low;
		int k= mid+1;
		int l= low;
		while(j <= mid && k <= high) {
			if(t[j] >= t[k]){
				b[l]= t[k];
				k++;
			}
			else{
				b[l]= t[j];
				j++;
			}
			l++;			
		}
		
		while(j <= mid) {
			b[l]= t[j];
			j++;
			l++;
		}		
	}
	
	public int binarySearch(int[] a, int b) {
		
		int low= 0;
		int high= a.length -1;
		int mid= (low+high)/2;
		
		while(low <= high) {
			mid = (low+high)/2;
			if(a[mid] == b) {
				return mid;
			} else if(a[mid] > b) {
				high= mid -1;
			} else {
				low= mid + 1;
			}			
		}
		return -1;		
	}
	
	private void countNumbersInNumber(int number) {
		
		int count=0;
		
		do {
			count += number % 2;
			number = number / 2;
		} while(number > 0);
		
		System.out.println(count);
	}
	
	private void findOccurancesInTwoArray() {
		
		int[] a= new int[] { 2, 4, 5, 5, 9};
		int[] b= new int[] { 3, 5, 5, 9, 12};
		
		int aLen= a.length-1;
		int bLen= b.length-1;
		int i = 0;
		int j= 0;
		Set<Integer> matched= new HashSet<Integer>();
		int occurances= 0;
		while( i <= aLen  && j <= bLen) {
			
			while( a[i] < b[j]) {
				i++;
			}
			while(a[i] > b[j]) {
				j++;
			}
			
			if(a[i] == b[j]) {
				matched.add(a[i]);
				occurances++;
				i++;
				j++;
			}
		}
		
		System.out.println(matched);
		System.out.println(occurances);
		
	}

	private void findOccurancesOfLetters(String s) {
		
		int l=s.length();		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		char highChar = 0;
		int highest= 0;
		char secondHighest= 0;
		int secondHighestCount= 0;
		
		for(int i=0; i < alpha.length(); i++) {		
			int highOccurances=0;
			for(int j=0; j < l; j++) {
				if(alpha.charAt(i) == s.charAt(j)) {
					highOccurances++;	
					
					if(highOccurances > highest) {						
						highChar= s.charAt(i);
						highest=  highOccurances;
						
					}
					
				}
			}
		}
		
		System.out.println("second "+ secondHighest);
		System.out.println("secondcnt "+ secondHighestCount);
		System.out.println("Char "+ highChar);
		System.out.println("Char "+ highest);
		
	}
	
	public void numberReverse(String name) {
		
		int num= Integer.valueOf(name).intValue();
		int reverse= 0;
		int reminder=0;
		do {
			
			reminder = num % 10;
			num = num / 10;	
			reverse  = reverse * 10 + reminder;
			
		}while(num > 0);
		
		System.out.println(reverse);
		
	}
	
	public void stringReverse(String name) {
		
		int l= name.length();
		char[] a= name.toCharArray();
		char temp= 0;
		for(int i=0, j= l-1; i<l/2; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;		
		}
		
		System.out.println(new String(a));
		
	}
	
	private boolean isPalindrome(String name) {
		
		int l= name.length();
		char[] a= name.toCharArray();
		for(int i=0, j= l-1; i < l/2; i++, j--) {
			
			if(a[i] != a[j]) {
				return false;
			}
			
		}
		return true;		
	}
	
	public void PrimeNumber(int range) {
		boolean isPrime= true;
		for(int i=1; i < range; i++) {
			isPrime= true;
			
			for(int j=2; j < i; j++) {
				if(i%j == 0) {
					isPrime= false;
				}
			}
			
			if(isPrime) {
				System.out.println(i+" ");
			}
			
		}
	}
	
	public void sqrt(int x) {
		
		int i=0;
		double result= 0d; 
		while(i * i < x) {
			i++;
		}
		
		result = x/i;
		result=(result+i)/2;
		
		System.out.println(result);
		System.out.println( Math.sqrt(x) );
	}
	
	private void countSimilarWords(String para) {
		String temp= para.replaceAll("\\n", " ");
		String[] spiltters= temp.replaceAll("[;,!@$#|?&]", " ").split(" ");
		Map<String, Integer> matchedWordCount= new HashMap<String, Integer>();
		String tmp= null;
		Set<String> countWordSet= new HashSet<String>();
		
		for(int i=0; i < spiltters.length; i++) {	
			if(!spiltters[i].isEmpty())
				countWordSet.add(spiltters[i].trim().toLowerCase());			
		}
		
		Iterator<String> itr= countWordSet.iterator(); 
		while(itr.hasNext()) {
			tmp = itr.next();
			int count=0;
			for(int j=0; j < spiltters.length; j++) {
				if(tmp.equalsIgnoreCase(spiltters[j])) {
					count++;
				}
			}
			matchedWordCount.put(tmp, count);			
		}
		
		Iterator<Entry<String, Integer>> itrMap= matchedWordCount.entrySet().iterator();
		Entry<String, Integer> data=null;
		while(itrMap.hasNext()) {
			data= itrMap.next();
			System.out.println(data.getKey() +" = " + data.getValue());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		TestSort o= new TestSort();
		
		int[] a = { 8, 5, 3, 7, 5, 4, 9, 2 };		
		
		//a= o.insertionSort(a);
		//a= o.bubbleSort(a, a.length);
		//a= o.quickSort(a, 0, a.length-1);
		//o.mergeSort( 0, o.b.length-1);
		//for(int i =0; i < o.b.length; i++){
		//	System.out.println(o.b[i]+",");
		//}
		int[] s= { 2, 4, 6, 7, 8, 9 };
		//int index= o.binarySearch(s, 2);
		//System.out.println(index);
		
		int number= 3456;
		//o.countNumbersInNumber(number);
		//o.findOccurancesInTwoArray();
		String name= "aswani kumar vinnakota";
		//o.findOccurancesOfLetters(name);
		String numName= "3456";
		//o.numberReverse(numName);
		String reverseName= "aswanikumar";
		//o.stringReverse(reverseName);
		String palindromeName= "malayalam";
		//boolean result= o.isPalindrome(palindromeName);
		//System.out.println(result);
		
		int primeRagne= 20;
		//o.PrimeNumber(primeRagne);
		
		int sqrtNum= 750;
		o.sqrt(sqrtNum);
		
		String sentence = "How much wood, would a woodchuck chuck\n"+  
                "If a woodchuck could chuck wood?\n"+  
                "A woodchuck would chuck all the wood he could.\n"+  
                "If a woodchuck could chuck wood!";
		
		o.countSimilarWords(sentence);
	}

	
	
	
}
