package com.ge.interview;

public class SpiralModel {
	
	public void getSpiralArray(int dim){
		
		int[][] a= new int[dim][dim];
		int currNum=0;
		for(int i=0; i<dim; i++){
			for(int j=0; j<dim; j++){
				a[i][j]= ++currNum;
				//System.out.println(a[i][j]);
			}
		}
		
		int r= dim; // Number of rows
		int c= dim; // Number of cols
		int m= 0;   // start index of row
		int n= 0;   // start index of column
		
		while(m < r && n < c){
			
			//Print First line
			for(int i=n; i < c; i++){
				System.out.println(a[n][i]);
			}
			n++;
			
			for(int i= n; i < r; i++){
				System.out.println(a[i][c-1]);
			}
			c--;
			
			for(int i= c-1; i >= m; i--){
				System.out.println(a[r-1][i]);
			}
			r--;
			
			for(int i = r -1; i >= n; i--){
				System.out.println(a[i][m]);
			}
			m++;			
			
		}		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SpiralModel o= new SpiralModel();
		o.getSpiralArray(4);

		

	}

}
