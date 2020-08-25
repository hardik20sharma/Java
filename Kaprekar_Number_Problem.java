import java.util.*;
public class Kaprekar_Number_Problem
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Integer n = scan.nextInt();
      Integer n_len = Integer.toString(n).length();
      String n2 = Integer.toString(n*n);
      
      Integer sum1 = 0, sum2 = 0;
      
      if(n_len > 1)
         sum1 = Integer.valueOf( n2.substring(0, n_len - 1) ) + Integer.valueOf( n2.substring(n2.length() - n_len , n2.length()) );

      sum2 = Integer.valueOf( n2.substring(0, n_len) ) + Integer.valueOf( n2.substring(n2.length()-n_len , n2.length()));
      if(sum1 == n || sum2 == n)
         System.out.println("Kaprekar Number");
      else
         System.out.println("Not a Kaprekar Number");
      scan.close();
   }
}