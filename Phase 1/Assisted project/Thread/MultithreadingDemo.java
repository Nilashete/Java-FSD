package com.simlplilearn.Thread;

public class MultithreadingDemo extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			
			try {
				Thread.currentThread().sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		MultithreadingDemo t1 = new MultithreadingDemo();
		MultithreadingDemo t2= new MultithreadingDemo();
		MultithreadingDemo t3= new MultithreadingDemo();
		t1.start();
		t2.start();
		t3.start();
	}

}
