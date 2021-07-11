import java.util.*;
public class Numberconversion
{
 public static void main(String args[])
 {
  int n,t;
  String s;
  Scanner sc= new Scanner(System.in);
  n=sc.nextInt();
  System.out.println("enter your choice form 1 to 3");
  System.out.println("1:Binary,2:octal,3:hexadecimal");
  t=sc.nextInt();
  switch(t)
  {
   case 1:s= Integer.toBinaryString(n);
          System.out.print("binary value: "+s);
          break;
   case 2:s= Integer.toOctalString(n);
          System.out.print("Octal value: "+s);
          break;
   case 3:s= Integer.toHexString(n);
          System.out.print("Hexa value: "+s);
          break;
   default:
          System.out.print("your choice is invalid");
  }
 }
}
