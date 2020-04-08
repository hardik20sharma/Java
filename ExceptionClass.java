package exceptionHandling;
import java.util.*;

class AgeException extends Exception
{
	public AgeException()
	{
		super("Age must be greater than 18");
	}
}

public class ExceptionClass
{
	static void something()
	{
		int[] a = new int[2];
		System.out.print(a[30]);
	}

	public static void main(String[] args)
	{
		try
		{
			something();
		}
		
		catch(Exception e)
		{
			System.out.print("Error");
		}
	}

}

/*
public static void main(String[] args) throws AgeException
{
	int age;
	Scanner scan = new Scanner(System.in);
	System.out.print("Please enter age: ");
	age = scan.nextInt();
	
	if(age < 18)
		throw (new AgeException());
	scan.close();
}
*/