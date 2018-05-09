package com.ge.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountSimilarWords {
	
	
	
	
	private void countWords(String para) {
		String temp= para.replaceAll("\\n", " ");
		String[] spiltters= temp.replaceAll("[;,!@$#|?&]", " ").split(" ");
		Map<String, Integer> matchedWordCount= new HashMap<String, Integer>();
		String tmp= null;
		Set<String> countWordSet= new HashSet<String>();
		
		for(int i=0; i < spiltters.length; i++) {	
			if(!spiltters[i].isEmpty())
				countWordSet.add(spiltters[i].trim().toLowerCase());			
		}
		
		Iterator<String> itr= countWordSet.iterator(); 
		while(itr.hasNext()) {
			tmp = itr.next();
			int count=0;
			for(int j=0; j < spiltters.length; j++) {
				if(tmp.equalsIgnoreCase(spiltters[j])) {
					count++;
				}
			}
			matchedWordCount.put(tmp, count);			
		}
		
		Iterator<Entry<String, Integer>> itrMap= matchedWordCount.entrySet().iterator();
		Entry<String, Integer> data=null;
		while(itrMap.hasNext()) {
			data= itrMap.next();
			System.out.println(data.getKey() +" = " + data.getValue());
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// example sentence  
        String sentence = "How much wood, would a woodchuck chuck\n"+  
                          "If a woodchuck could chuck wood?\n"+  
                          "A woodchuck would chuck all the wood he could.\n"+  
                          "If a woodchuck could chuck wood!";
        
        CountSimilarWords c= new CountSimilarWords();
        c.countWords(sentence);
		
	}

}
