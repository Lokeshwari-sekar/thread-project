package com.threadconcept;
//class table
class Table
{
	//Parameterized method
	void printTable(int n)
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+"x"+n+"="+(i*n));
	}
}
}
//first thread class extends main thread
class FirstThread extends Thread
{
	//object creation
	Table t=new Table();
	FirstThread(Table t)
	{
		this.t=t;}
	public void run()
	{
		t.printTable(3);}}
//second thread class extends main thread
class SecondThread extends Thread
{
	//object creation
	Table t;
	 SecondThread(Table t)
	{
		this.t=t;}
	public void run()
	{
		t.printTable(6);
	}}

public class ThreadTable 
{public static void main(String[] args) throws InterruptedException{
		Table tob=new Table();
		FirstThread ft1=new FirstThread(tob);//setting name without set method
		SecondThread st1=new SecondThread(tob);//setting name without set method
		ft1.start();
		ft1.join();
		st1.start();
		
	}
}
