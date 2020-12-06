package stirngs;

public class StringClass
{
	public static void main(String[] args) 
	{
		//Program 1
		//String s1="Hello", s2="World";
		//System.out.print( s1.compareTo(s2) );
		
		//Program 2
		//String s1="Dumbledore", num = "10014527357";
		//String s3 = s1.substring(0, 4) + num.substring(num.length() - 4, num.length());
		//System.out.print(s3);
		
		//Program 3
		String s1 = "De", num = "10014527357", s3;
		if(s1.length() >= 4)
			s3 = s1.substring(0, 4) + num.substring(num.length() - 4, num.length());
		else
			s3 = s1 + num.substring(num.length() - 4, num.length());
		System.out.print(s3);
	}
}
//subString() - extracts substring form a string
//StringBuilder and StringBuffer
//StringBuilder eventString = new StringBuilder ("Hello There");
	//setLength(), append(), insert(), setCharAt(), charAt()
