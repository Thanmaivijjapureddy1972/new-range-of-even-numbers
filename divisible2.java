import java.util.*;
class Divisible2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of elements");
int n=sc.nextInt();
int flag=0,count=0;
HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
int key;
key=arr[i];
if(key%5==0)
count++;
if(key%3==0)
flag++;
}
System.out.println("5="+count);
System.out.println("3="+flag);

}
}
