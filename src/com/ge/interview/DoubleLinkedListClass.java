package com.ge.interview;

public class DoubleLinkedListClass {
	
	private Node	head;	
	private Node 	tail;
	private int size;
	
	DoubleLinkedListClass(){
		this.head= null;
		this.tail= null;
		size=0;
		
	}
	
	protected class Node{
		int data;
		Node next= null;
		Node prev= null;
		
		Node(int d, Node next, Node prev){
			data = d;
			this.next = next;
			this.prev = prev;
		}

		public int getData() {
			return data;
		}

		public Node getNext() {
			return next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
	}
	
	public Node insert(int d, int pos){
		Node currNode= null;
		if(pos > size){
			System.out.println("Exceeds the size");
		}
		//First Node
		if(head == null) {
			currNode= new Node(d, null, null);
			head= currNode;
			
		}
		else{
			Node prevNode= null;
			Node nextNode= null;
			int i=1;			
			while(i < pos){
				prevNode = head.next;
				i++;
			}
			nextNode= prevNode.next;
			currNode = new Node(d, nextNode, prevNode);				
			prevNode.next= currNode;
			nextNode.prev= currNode;	
			size++;
		}	
		return currNode;		
	}
	
	
	public void delete(int d){
		
		if(size > 0){
			
			Node currNode = head;
			
			while(null != currNode)
			if(currNode.data == d){
				if(currNode.next !=null){
					
				}
			}
			
			
		}
	}
	
	
	
	
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
