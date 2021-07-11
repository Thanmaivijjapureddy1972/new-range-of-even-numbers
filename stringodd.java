import java.util.*;
class String_Odd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s;
int i,j;
System.out.println("enter a string:-");
s=sc.next();
int n=s.length();
for(i=0;i<n;i++)
{
j=i+1;
if(j%2!=0)
System.out.print(s.charAt(i)+" ");
}
for(i=0;i<n;i++)
{
j=i+1;
if(j%2==0)
System.out.print(" "+s.charAt(i));
}
}
}
