package com.emc.interview;

public class DoubleLinkedList {
	
	Node head;
	Node tail;
	
	class Node {
		int data;
		Node next;
		Node prev;
		
		Node(int d, Node n, Node p) {
			data= d;
			next= n;
			prev= p;			
		}

		public int getData() {
			return data;
		}		

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}
		
		
	}
	
	int size=0;
	public void insert(int d, int pos) {
		Node currentNode;	
		if(pos > size) {
			System.out.println("Exceeds the size");
		}
		//FirstNode
		if(head == null) {
			currentNode= new Node(d, null, null);	
			head= currentNode;
		}else {
			
			Node nextNode= null;
			Node prevNode= null;
			int i=0;
			while(i < pos) {
				prevNode= head.next;
				i++;
			}
			
			nextNode = prevNode.next;
			currentNode= new Node(d, nextNode, prevNode);
			prevNode.next= currentNode;
			nextNode.prev= currentNode;
			size++;
		}
		
	}
	
	public void delete(int d) {
		
		if(size > 0) {			
			Node currNode= head;
			
			while(currNode != null) {
				if(d == currNode.getData()) {
					currNode.prev.next= currNode.next;
					currNode.next.prev= currNode.prev;		
					break;
				}				
				currNode= currNode.next;
			}			
		}		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
