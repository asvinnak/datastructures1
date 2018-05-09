package com.emc.interview;

import com.ge.interview.LinkedListReverse.Node;

public class ReverseLinkList {
	
	class Node {
		int data;
		Node next;
		
		Node(int d, Node n) {
			data= d;
			next= n;
		}
		
		//[1,2]->[2,3]->[3,4]->[4,null]
		//[1,null]->[2,1]->[3,4]->[4,null]
		//[1,null]->[2,1]->[3,2]->[4,3]
		public void reverse(Node first){		
			Node currentNode= first;
			Node nextNode= first.next;
			Node loopNode= null;
			
			while(nextNode != null) {
				currentNode.next= loopNode;
				loopNode= currentNode;
				currentNode= nextNode;
				nextNode= currentNode.next;
			}
			
			first= currentNode;
			first.next= loopNode;
					
		}		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
