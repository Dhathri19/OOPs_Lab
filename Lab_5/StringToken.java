import java.util.*;
import java.lang.String;
import java.util.StringTokenizer;

class StringToken
{
    public static void main(String args[])
	{
		String a = "The quick * brown / fox jumps / over the * lazy dog";

		System.out.println("\n");
	
		StringTokenizer st = new StringTokenizer("The quick * brown / fox jumps / over the * lazy dog");
		
		int count = st.countTokens();

		int capacity = "The quick * brown / fox jumps / over the * lazy dog".length();

		System.out.println("Total number of tokens is: " + count);

		System.out.println("Capacity of the string passed is: " + capacity);
	
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

		System.out.println("\n");

		StringTokenizer st2 = new StringTokenizer(a);

		count = st2.countTokens();

		capacity = a.length();

		System.out.println("Total number of tokens is: " + count);

		System.out.println("Capacity of the string passed is: " + capacity);
		
		while(st2.hasMoreTokens())
		{
			System.out.println(st2.nextToken());
		}

		System.out.println("\n");

		StringTokenizer st3 = new StringTokenizer(a, "/*");

		count = st3.countTokens();

		System.out.println("Total number of tokens is: " + count);

		while(st3.hasMoreTokens())
		{
			System.out.println(st3.nextToken());
		}
	}
}

