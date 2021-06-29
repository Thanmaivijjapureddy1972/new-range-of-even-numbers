import java.util.*;
class Evenoddpro
{
public static void main(String args[])
{
int n,even=0,odd=0,r;
System.out.println("Enter the value of n:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n>0)
{
r=n%10;
if(r%2==0)
{
even++;
}
else
{
odd++;
}
n=n/10;
}
System.out.println("Number of even digits="+even);
System.out.println("Number of odd digits="+odd);
}
}
