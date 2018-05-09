package com.emc.interview;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithLinkedList {
	
	int CACHE_SIZE;
	Map<String, Node> map= new HashMap<String, Node>();
	Node head;
	Node tail;
	class Node {		
		String key;
		String value;
		Node next;
		Node prev;
		
		Node(String k, String v) {
			key= k;
			value= v;
		}
	}
	
	public LRUCacheWithLinkedList(int limit) {
		CACHE_SIZE= limit;
		head= new Node(null,null);
		tail= new Node(null,null);
		head.next= tail;
		tail.prev= head;		
	}
	
	public void insert(String k, String  v) {
		Node n= null;
		if(map.get(k) != null) {
			n= map.get(k);
		}
		
		if(isLRURemoved()) {
			map.remove(tail.key);
			removeLRU(tail);
		}
		
		if(n != null) {
			removeLRU(n);
			insertAtHead(n);
			n.value= v;		
		} else {
			n= new Node(k, v);
			insertAtHead(n);
		}
		
	}
	
	public void insertAtHead(Node node){
		node.next= head.next;
		node.prev= head;
		head.next.prev= node;
		head.next= node;		
	}
	
	public void removeLRU(Node n) {		
		n.prev.next= n.next;
		n.next.prev= n.prev;		
	}
	
	
	public boolean isLRURemoved() {
		return CACHE_SIZE > map.size();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
