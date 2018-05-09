package com.ge.interview;

public class StackImplUsingLinkedlist {
	int stackSize;
	private Node head;
	protected int maxValue;
	protected int minValue;
	
	protected Object[] maxValueArray;
	private int maxValueSize; 
	
	
	protected class Node {		
		protected Object data;
		protected Node next;		
		
		
		Node(Object o, Node n){
			this.data= o;
			this.next= n;
		}		
	}
	
	public StackImplUsingLinkedlist(){
		stackSize= 0;
		head= null;
	}
	
	
	public void push(Object o){
		if(stackSize == 0){
			minValue = Integer.valueOf(o.toString());
			maxValue = Integer.valueOf(o.toString());
		}
		if(maxValue < Integer.valueOf(o.toString())){
			maxValue  = Integer.valueOf(o.toString());
			maxValueArray[maxValueSize] = maxValue;
			maxValueSize ++;
		}
		if(minValue > Integer.valueOf(o.toString())){
			minValue = Integer.valueOf(o.toString());
		}
		
		head = new Node(o, head);
		stackSize ++;
	}
	
	public Object pop(){
		Object top= null;
		if(head != null){
			top = head.data;
			head = head.next;			
		}
		
		if( Integer.valueOf(top.toString()) == maxValue){
			//remove top from maxValueArray;
			
		}
		return top;
	}
	
	
	public int getMaxValue(){
		int returnValue=0;
		if(maxValueArray != null){			
			returnValue= maxValue;
			maxValueSize--;
			maxValue  = Integer.valueOf(maxValueArray[maxValueSize].toString());
		}
		
		return returnValue;
	}
	
	
	
	
	
	
	
	

}
