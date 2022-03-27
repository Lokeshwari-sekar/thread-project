package com.threadconcept;
//thread program....
class SubApplication extends Thread//extending thread class(implementation)
{

	public SubApplication(String string) 
	{
		super(string);
	}
	//run method
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("i="+i+"thread name"+Thread.currentThread());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				
				e.printStackTrace();
			}
		}
	}	
}

//main method
public class ExtendsThreadClass {

	public static void main(String[] args) {
		
		//object creation
		SubApplication sa=new SubApplication("first");
		SubApplication sa1=new SubApplication("second");
		//start method
		sa.start();
		sa1.start();
		

	}

}
