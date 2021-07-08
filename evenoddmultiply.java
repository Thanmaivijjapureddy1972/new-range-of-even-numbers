import java.util.Scanner;
class Count 
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int i,eventotal=0,oddtotal=0;
System.out.print("enter the size value  ");
int size=sc.nextInt();
int ar[]=new int[size];
System.out.print("enter the elements  ");
for(i=0;i<size;i++)
{
ar[i]=sc.nextInt();
}
for(i=0;i<size;i++)
{
if(ar[i]%2==0)
{
eventotal++;
}
else
{
oddtotal++;
}
}
if(eventotal*oddtotal%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
}
}
