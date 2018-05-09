package com.emc.interview;

public class EMCLinkedList {
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int i, Node n) {
			data= i;
			next= n;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}
		
	}

	public void add(int d) {
		Node n= new Node(d, head);
		head= n;
	}
	
	public int getValue(){
		return head.getData();
	}
	
	public int getNextValue() {
		if(head.next != null) {
			head= head.next;
			return head.getData();
		}
		else {
			System.out.println("No nodes exist");
		}
		return -1;
	}
	
	public void delete() {
		if(head.next != null) {
			Node nextNode= head.next;
			head= null;
			head= nextNode;
		}
		else {
			System.out.println("No nodes availavle");
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EMCLinkedList o = new EMCLinkedList();
		for(int i=1000; i <= 1005; i++) {
			o.add(i);
		}
		
		System.out.println(o.getValue());
		o.delete();
		System.out.println(o.getValue());
		System.out.println(o.getNextValue());

	}

}
