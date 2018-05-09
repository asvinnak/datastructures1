package com.ge.interview;

import java.util.HashMap;
import java.util.Map;

public class LRUCacheWithLinkedList {
	
	int CACHE_SIZE;
	Node head;
	Node tail;
	Map<String, Node> 	map= new HashMap<String, Node>(CACHE_SIZE);
	Node n;
	
	class Node{
		Node prev;
		Node next;
		String key;
		String val;
		
		Node(String k, String v){
			key = k;
			val = v;
		}
		
	}
	
	LRUCacheWithLinkedList(int limit){
		CACHE_SIZE = limit;
		head= new Node(null, null);
		tail= new Node(null, null);
		head.next = tail;
		tail.prev= head;
	}
	
	
	
	public void addAtHead(Node n){
		n.next= head.next;
		n.prev= head;
		head.next.prev= n;
		head.next= n;		
	}
	
	public void removeFromList(Node n){
		n.prev.next= n.next;
		n.next.prev = n.prev;
	}
	
	
	public void put(String key, String val){
		
		if(map.containsKey(key)){
			n= map.get(key);
		}
		
		
		if(isLRUEntryRemoved()){	
			map.remove(tail.key);
			removeFromList(tail);
		}		
		//if entry is present update else createnew
		if(n != null){
			//update
			//remove node
			removeFromList(n);
			addAtHead(n);
			//add at head
			//update value
			n.val = val;
			
		}else{
			n= new Node(key, val);		
			map.put(key, n);
		}
	}
	
	public boolean isLRUEntryRemoved(){
		return map.size() > CACHE_SIZE;
	}
	
	
	
	
	
	
	
	
	

}
