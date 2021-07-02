import java.util.Scanner ;
import java.util.*;
public class Numberseries
{
public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the number of rows:");
 int n = sc.nextInt();
 int s=0, c;
 for (c=1; c<=n; c++){
 s= s*10 + c;
 System.out.println(s + " ");
 }
 }
}
