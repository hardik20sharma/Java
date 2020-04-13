package guessing_game;
import java.util.Random;
import java.util.Scanner;

public class Game 
{
	public static void main(String[] args)
	{
		String s = "world";
		char[] s_char = s.toCharArray();
		String ch;
		int i;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		for(i=0; i<s.length()/2 + 1; i++)
			s_char[ rand.nextInt(s.length()) ] = '*';

		while(true)
		{
			System.out.println(s_char);
			System.out.print("Guess a character: ");
			ch = scan.next();
			
			if(s.contains(ch))
			{
				s_char[s.indexOf(ch)] = ch.charAt(0);
				if(s_char.toString().compareTo(s) == 0)
					break;
			}
			else
				System.out.println("Better luck next time");
		}
		
		System.out.println("Great game !! Well Played !!");
	}
}