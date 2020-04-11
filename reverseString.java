package stringReverseLambdaFunction;
import java.util.*;

interface ReverseString
{
	String function(String x);
}


public class reverseString
{
	public static void main(String[] args)
	{
		String string;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the string: ");
		string = scan.next();

		StringBuilder sb = new StringBuilder();
		sb.append(string);
		
		ReverseString rs;
		rs = (x)->
		{
			String reversedString;
			reversedString = sb.reverse().toString();
			return reversedString;
		};
		
		System.out.print("Reversed String: " + rs.function(string));
		scan.close();
	}
}