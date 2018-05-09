package com.ge.interview;

import java.util.Currency;

public class LinkedListReverse {
	
	public class Node{		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			next = null;
		}		
	}
	
	
	public void reverse(Node first){		
		Node nextNode, currentNode, loopNode;
		
		currentNode = first;
		nextNode= first.next;
		loopNode= null;
		
		while(nextNode != null){
			currentNode.next = loopNode;
			loopNode= currentNode;
			currentNode= nextNode;
			nextNode = currentNode.next;				
		}
		
		first= currentNode;
		first.next = loopNode;
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
