package com.tnsif.daythirteen.thread;

public class runnabledemo {
	public static void main(String[] args) {
UsingRunnable obj =new UsingRunnable(5,20,"hello coder..");


	Runnable runnable=new Runnable() {
	public void run()	{
	System.out.println("running task from anonymous class");
	}
	};
Thread thread=new Thread(runnable);
thread.start();
	runnable=new Runnable() {
		public void run()
		{
		try
		{
			
		for(int i=1;i<=4;i++)
				
		{
			System.out.println("child thread task3:"+i);
			Thread.sleep(1500);
		}
		}
		
		catch(InterruptedException e) {
		System.out.println("error");
		
		}}};
		Thread thread2=new Thread(runnable);
		thread2.start();
		
	}}
	