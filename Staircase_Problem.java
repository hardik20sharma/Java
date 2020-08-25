import java.util.*;

public class Staircase_Problem 
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      int steps = scan.nextInt();

      int[] a = new int[steps + 1];
      a[1] = 1;
      a[2] = 2;

      for(int i=3; i<=steps; i++)
         a[i] = a[i-1] + a[i-2];

      System.out.println(a[steps]);
      scan.close();
   }
}