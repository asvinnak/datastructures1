package com.ge.interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLRUCacheMap {
	
	private ConcurrentHashMap<String, String> map;
	private ConcurrentLinkedQueue<String> queue;
	private int	capacity=0;
	
	ConcurrentLRUCacheMap(int maxEntries){
		this.capacity=maxEntries;
		map= new ConcurrentHashMap<String, String>(maxEntries);
		queue= new ConcurrentLinkedQueue<String>();
	}	
	
	public void put(String k, String v){
		
		if(map.containsKey(k)){
			queue.remove(k);
		}
		
		if(isRemoveOldestEntry()){
			removeLRUEntry();
		}
		
		map.put(k, v);
		queue.add(k);		
	}
	
	
	public boolean isRemoveOldestEntry(){
		return map.size() > capacity;		
	}
	
	private void removeLRUEntry(){
		String oldestEntry = queue.poll();
		map.remove(oldestEntry);		
	}
	
	
	public String get(String s){
		return map.get(s);
	}
}
