import java.util.*;
class Factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
int prefix[]=new int[101];
prefix[1]=1;
for(int i=2;i<100;i++)
{
prefix[i]=prefix[i-1]*i;
}
System.out.println("Enter no.of queries:");
int q=sc.nextInt();
for(int j=0;j<q;j++)
{
n=sc.nextInt();
System.out.println(prefix[n]);
}
    }
}
