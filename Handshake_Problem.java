import java.util.*;

public class Handshake_Problem
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      Integer n = scan.nextInt();
      System.out.println( (n * (n-1)) / 2);
      scan.close();
   }
}
