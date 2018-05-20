package com.lorhan.examples;

/*
 *                 
 */

public class ThreadExample {

	public static void main(String[] args) {
		  
		Message1 t1 = new Message1();
		Thread t2 = new Thread(new Message2());
		t1.start();
		t2.start();
		
	}

}

//Creating a thread by extending Thread class
class Message1 extends Thread 
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" Message : The harder you work,the luckier you get!!");
	}
}

//Creating a thread by implementing Runnable
class Message2 implements Runnable
{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" Message : Java is a platform independent language");
	}
}