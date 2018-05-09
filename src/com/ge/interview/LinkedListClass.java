package com.ge.interview;

public class LinkedListClass {
	
	Node	head;
	
	protected class Node{
		
		private int data; 
		private Node nextValue= null;
		
		Node(int d, Node nextVaue){
			this.data = d;
			this.nextValue= nextVaue;
		}

		public int getData() {
			return data;
		}

		public Node getNextValue() {
			return nextValue;
		}

		public void setNextValue(Node nextValue) {
			this.nextValue = nextValue;
		}
				
	}
	
	
	public void add(int d){
		Node n= new Node(d, head);
		head = n;		
	}
	
	public void delete(){
		if(null != head.nextValue){
			Node nextNode = head.nextValue;
			head= null;
			head = nextNode;
		}
		else{
			System.out.println("No nodes to delete");
		}
	}
	
	public int	getCuurentValue(){
		int d= head.getData();			
		return d;
	}
	
	public int getNextValue(){
		int d = head.getData();
		head= head.nextValue;
		return d;
	}
	


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListClass o = new LinkedListClass();
		
		for(int i=1; i <= 3; i++){
			o.add(i);
		}
		
		System.out.println("Value in LibnkedList = "+ o.getCuurentValue());
		o.delete();
		System.out.println("Value in LibnkedList = "+ o.getCuurentValue());
		System.out.println("Value in LibnkedList = "+ o.getNextValue());
		System.out.println("Value in LibnkedList = "+ o.getNextValue());

	}

}
