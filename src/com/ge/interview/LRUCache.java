package com.ge.interview;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V>{
	
	private int capacity;
	
	LRUCache(int maxEntries){
		super(maxEntries+1, 0.1f, true);
		this.capacity= maxEntries;		
	}
	
	
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		
		return size() > capacity;
	}
	
	public static void main(String[] args) throws Exception{
		
		Map<String, String> map= Collections.synchronizedMap(new LRUCache<String, String>(30));
		
		
	}

}
