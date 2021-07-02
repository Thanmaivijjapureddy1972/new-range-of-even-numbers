import java.util.Scanner;
import java.util.*;
public class Primenumbers
{
	public static void main(String args[])
	{
		int a, b,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the lower limit : "); 
		a = s.nextInt();
		System.out.print("Enter the upper limit :"); 
		b= s.nextInt();
		System.out.println("Prime numbers between  range :");

		for(i = a; i <= b; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}
