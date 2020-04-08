package bulgarian_Solitaire;

import java.util.*;

public class Bulgarian_Solitaire {

	static int Number_of_cards = 45;
	static int max_pile_size = 10;
	
	public static void main(String[] args)
	{
		Random rand = new Random();
		int num, pile_size;
		
		//pile_size - generating random number
		pile_size = rand.nextInt(max_pile_size - 1 ) + 1;
		System.out.println(pile_size);
		
		//Creation of pile with size pile_size
		int pile[] = new int[pile_size];
		Arrays.fill(pile, 0);
		
		//distribute the number
		for(int i=0; i<Number_of_cards; i++)
		{
			num = rand.nextInt(pile_size);
			pile[num] += 1;
		}
		
		System.out.println();
		for(int i=0; i<pile.length; i++)
			System.out.print(pile[i] + " ");
	}
}