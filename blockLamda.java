/*
package lambdaFunctions;
import java.util.*;

interface NumericTest
{
	int function(int x);
}

public class blockLamda
{
	public static void main(String[] args)
	{
		// Inputs
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number: ");
		num = scan.nextInt();
		
		// Lambda Function
		NumericTest nt;
		nt = (x) -> {
			
			int fact = 1;
			for(int i=2; i<=x; i++)
				fact = fact * i;
			
			return fact;
		};
		
		// Printing result
		System.out.println("The factorial of " + num + " is: " + nt.function(num));
		scan.close();
	}
}
*/