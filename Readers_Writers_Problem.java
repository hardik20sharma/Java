package operating_Systems;

import java.util.concurrent.Semaphore; 

class Queue 
{ 
	int item;  
	static Semaphore semaphore_Consumer = new Semaphore(0); 
	static Semaphore semaphore_Producer = new Semaphore(1); 

	void get() 
	{ 
		try
		{  
			semaphore_Consumer.acquire(); 
		} 
		catch (InterruptedException e)
		{
			System.out.println("InterruptedException caught"); 
		} 
		System.out.println("Consumer consumed item : " + item);  
		semaphore_Producer.release(); 
	} 
	
	void put(int item) 
	{ 
		try
		{
			semaphore_Producer.acquire();
		}
		catch (InterruptedException e)
		{ 
			System.out.println("InterruptedException caught"); 
		} 
		this.item = item; 
		System.out.println("Producer produced item : " + item); 
		semaphore_Consumer.release(); 
	} 
} 

class Producer implements Runnable
{ 
	Queue q; 
	Producer(Queue q) 
	{ 
		this.q = q; 
		new Thread(this, "Producer").start(); 
	} 

	public void run() 
	{ 
		for (int i = 0; i < 5; i++)  
			q.put(i); 
	} 
} 

class Consumer implements Runnable
{ 
	Queue q; 
	Consumer(Queue q) 
	{ 
		this.q = q; 
		new Thread(this, "Consumer").start(); 
	} 

	public void run() 
	{ 
		for (int i = 0; i < 5; i++)  
			q.get(); 
	} 
} 

public class Readers_Writers_Problem
{ 
	public static void main(String args[]) 
	{  
		Queue q = new Queue(); 
		new Consumer(q); 
		new Producer(q); 
	}
}