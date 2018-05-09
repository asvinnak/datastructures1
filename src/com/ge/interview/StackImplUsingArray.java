package com.ge.interview;

public class StackImplUsingArray {
	
	protected Object[] objectArray;
	private final static int MAX_SIZE= 50;
	
	int	stackSize;
	
	StackImplUsingArray(){
		objectArray= new Object[MAX_SIZE];
		stackSize= 0;		
	}
	
	public void push(Object o) throws ArrayIndexOutOfBoundsException{
		if(stackSize < MAX_SIZE) {
			objectArray[stackSize]= o;
			stackSize ++;
		}
		else{
			throw new ArrayIndexOutOfBoundsException("'Stack overflow");
		}
	}
	
	public Object pop(){
		
		if(stackSize > 0){			
			stackSize--;
			return objectArray[stackSize];
			
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Stack overflow");
		}
		
	}
	
	

}
