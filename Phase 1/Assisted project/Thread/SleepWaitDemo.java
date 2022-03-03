package com.simlplilearn.Thread;

public class SleepWaitDemo {
	private static Object Lock=new Object();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			Thread.sleep(1000);
			System.out.println("Thread "+Thread.currentThread().getName()+" is woken up after"+" sleeping of 1 sec");
			
			synchronized (Lock) {
				Lock.wait(1000);
				System.out.println("Object "+Lock+" is woke after waiting of 1 sec");
			}
		
	}

}
