import java.util.*;
public class minimum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,i;
System.out.print("Enter array size:");
size=sc.nextInt();
int ar[];
ar=new int[size];
System.out.print("Enter array elements:");
for(i=0;i<size;i++)
{
ar[i]=sc.nextInt();
}
Arrays.sort(ar);
System.out.println("Minimum element is:" +ar[0]);
}
}
