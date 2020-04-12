package sets;
import java.util.*;

public class Sets 
{
	public static void main(String[] args)
	{

		Set<String> a = new TreeSet();
		Iterator<String> itre = a.iterator();
		String s = "hello";
		
		for(int i=0; i<s.length(); i++)
			a.add(Character.toString(s.charAt(i)));
		
		System.out.println(a);
		Iterator<String> iter = a.iterator();
		
		while(iter.hasNext())
			System.out.println(iter.next());
	}
}

//iter.remove	Method through which we can remove
//iter.add		Method through which we can add