package sieve_of_eratosthenes;

import java.util.*;
import java.util.TreeSet;
import java.util.Iterator; 

public class sieve_of_eratosthenes
{
	static void treeset_sieve_of_eratosthenes(int n)
	{
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i=2; i<=n; i++)
			ts.add(i);
		
		int i=2;
		while(i != n)
		{
			for(int multiple = 2; multiple*i<=n; multiple++)
				ts.remove(multiple*i);
			i++;
		}
		
		//Displaying the set
		Iterator<Integer> ts1 = ts.iterator();
		ts1 = ts.iterator();		
		while(ts1.hasNext())
			System.out.print(ts1.next() + " ");
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int n;
		n = scan.nextInt();
		treeset_sieve_of_eratosthenes(n);
		scan.close();
	}
}