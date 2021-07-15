import java.util.*;
import java.util.Scanner;
public class twin_prime
{
    static int prime(int num)
    {
        int n=0,i;
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                n=1;
                break;
            }
        }
        return n;
    }
    public static void main(String args[])
    {
        int num,num1,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Starting Number:");
        num=sc.nextInt();
        System.out.println("Enter Last Number:");
        num1=sc.nextInt();
        System.out.println("Twin prime numbers are");
        for(i=num;i<=num1;i++)
        {
            if(prime(i)==0 && prime(i+2)==0)
            {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
