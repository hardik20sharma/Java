package pattern;

import java.util.Arrays;
import java.util.Scanner;

public class Left_Aligned_Stairs
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the size: ");
		n = scan.nextInt();
		
		int arr[][] = new int[n][];

		// Assigning value in the array
		for(int i=0; i<n; i++)
		{
			arr[i] = new int[i+1];
			Arrays.fill(arr[i], 1);		// Fills the array with 1
		}
		
		// Printing the array
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
		scan.close();
	}
}