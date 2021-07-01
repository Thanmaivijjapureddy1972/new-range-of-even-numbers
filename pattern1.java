import java.util.*;
public class Pattern1
{
public static void main(String[] args)
{
int rows;
System.out.println("Enter number of rows: ");
Scanner sc = new Scanner(System.in);
rows = sc.nextInt();
for (int i=rows; i>=1; --i)
{
for(int j = 1; j <= i; ++j) 
{
System.out.print("* ");
}
System.out.println();
}
}
}
