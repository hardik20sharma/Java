package prac;
import java.util.Random;

public class SimilarCharInStringTogether {
	public static void main(String[] args)
	{
	    int[] arr = new int[21];
	    arr[20] = 0;
	    int i = 0, curr = 0;
	    
	    Random r = new Random();
	    while(i < arr.length - 1)
	        arr[i++] = r.nextInt(6) + 1;

	    i = 0;
	    while(i < arr.length - 1)
	    {
	        if(arr[i] == arr[i+1])
	        {
	            System.out.print("(" + arr[i++]);
	            while(arr[i] == arr[i+1])
	            	System.out.print(arr[i++]);
	            System.out.print(arr[i++] + ")");
	        }
	         
	        else
	        	System.out.print(arr[i++]);
	    }
	}
}