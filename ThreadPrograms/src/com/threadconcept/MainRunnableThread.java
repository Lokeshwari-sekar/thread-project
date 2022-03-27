package com.threadconcept;

class subRunaableThread implements Runnable//implements runnable interface(implementation)
{

	@Override
	public void run() 
	{
	System.out.println("inside a SubRunnable class "+Thread.currentThread());
		
	}
}
public class MainRunnableThread
{

	public static void main(String[] args) throws InterruptedException
	
	{
		System.out.println(Thread.currentThread());
		subRunaableThread srt=new subRunaableThread();//here there is no start method is present
		Thread th=new Thread(srt);//creating object for thread class 
		th.setName("first thread");  //and passing the obj then we get a start method
		
		
		subRunaableThread srt1=new subRunaableThread();
		Thread th1=new Thread(srt1);
		th1.setName("seccond thread");
		
		subRunaableThread srt2=new subRunaableThread();
		Thread th2=new Thread(srt2);
		th2.setName("third thread");
		
		th.start();
		th.join();
		th1.start();
		th.join();
		th2.start();

	}

}
