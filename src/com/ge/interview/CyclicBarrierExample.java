package com.ge.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CyclicBarrierExample {
	
	

	public static void main(String[] args) {
		
		  //starting each of thread
        ExecutorService executor = Executors.newFixedThreadPool(3);
		
		List<Future> outputs= new ArrayList<>();
		String result= null;
		
		//creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
            @Override
            public void run(){
            	
            	System.out.println("Entered into Main thread");
        	/*	for(int i=0; i < outputs.size(); i++) {
        		
        		    try {
        		    	result.concat((String) outputs.get(i).get());
        			} catch (InterruptedException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			} catch (ExecutionException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        		}*/
        		
                //This task will be executed once all thread reaches barrier
                System.out.println("All parties are arrived at barrier, result"+ result);
            }
        });

    
		
		CyclicBarrierTask task;
		for(int i=1; i <= 3; i++) {
			task= new CyclicBarrierTask(cb, "Thread"+ i);
			//executor.execute(task);
			outputs.add(executor.submit(task));
			
		}
		
		executor.shutdown();


	}

}
