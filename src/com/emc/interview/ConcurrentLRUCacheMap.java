package com.emc.interview;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLRUCacheMap {
	int capacity=0;
	ConcurrentHashMap<String, String> map;
	ConcurrentLinkedQueue<String> queue;
	
	public ConcurrentLRUCacheMap(int maxEntries) {
		capacity= maxEntries;
		map= new ConcurrentHashMap<String, String>(capacity);
		queue= new ConcurrentLinkedQueue<String>();
	}
	
	public void add(String k, String v) {
		
		if(map.contains(k)) {
			queue.remove(k);
		}
		
		if(isLRURemoved()) {
			removeLRUEntry();		
		}
		
		map.put(k, v);
		queue.add(k);
	}
	
	public boolean isLRURemoved() {
		return capacity > map.size();
	}
	
	public void removeLRUEntry() {
		String k= queue.poll();
		map.remove(k);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
