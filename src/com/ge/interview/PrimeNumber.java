package com.ge.interview;

public class PrimeNumber {
	
	public void primeNumbers(int n){
		
		boolean isPrime= true;
		System.out.println("Prime Numbers");
		int sum=0;
		for(int i=2; i < n; i++) {
			isPrime= true;
			for(int j=2; j<i; j++ ) {			
				if(i % j == 0)
				{
					isPrime= false;
					break;
				}
			}
			if(isPrime) {
				sum= sum+i;
				System.out.print(i+ ", ");
			}
		}
		System.out.println();
		System.out.println("Sum of Primes:"+ sum);
	}
	
	public boolean isPrime(int n){
		
		for(int i=2; i < n; i++){
			
			if(n % i == 0){
				return false;
			}
		}
		
		return true;
	}
	
	
	public void convertStringToNumber(String s){
		
		char[] ch= s.toCharArray();
		long num= 0L;
		
		for(int i=0; i < ch.length; i++){
			
			num =  10 * num + ch[i];
		}
		
		System.out.println(num);
	}
	
	public static void main(String[] a) {
		PrimeNumber o= new PrimeNumber();
		o.primeNumbers(1000);
	}

}
