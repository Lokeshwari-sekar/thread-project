package com.threadconcept;
//implementation using thread extends 
class SubThread extends Thread
{//class must be extends the thread class
	public void run()//it only runs the code 
	{
		System.out.println("Inside sub thread run"+Thread.currentThread());
	}
}
public class MainThread 
{
public static void main(String[] args) throws InterruptedException
	{
		//creating object for the sub thread
		System.out.println(Thread.currentThread());
		SubThread st=new SubThread();
		
		//we are changing the default name
		st.setName("first sub thread");
		
		SubThread st1=new SubThread();
		st1.setName("second sub thread");
		
		SubThread st2=new SubThread();
		st2.setName("third sub thread");
		
		SubThread st3=new SubThread();
		st3.setName("fourth sub thread");
		
		//here this method is used for start the run method 
		st.start();
		st.join();
		st1.start();
		st1.join();
		st2.start();
		st2.join();
		st3.start();//st2.start();//it throws the thread state exception
		}}
