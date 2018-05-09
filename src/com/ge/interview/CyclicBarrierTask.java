package com.ge.interview;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTask implements Callable<String> {
	
	CyclicBarrier cb= null;
	String s= null;
	
	CyclicBarrierTask(CyclicBarrier cb, String s) {
		this.cb = cb;
		this.s = s;
	}

	@Override
	public String call() throws Exception {
		System.out.println("Execution started :"+ s);
		cb.await();
		System.out.println("Returning  :"+ s);
		return s;
	}

}
