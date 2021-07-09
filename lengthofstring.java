import java.util.*;
public class string 
{
public static void main(String[] args) 
{
System.out.println("Enter a string ");
Scanner sc= new Scanner(System.in);
String originalString=sc.nextLine();
System.out.println("Entered string is "+originalString);
String newString=originalString.replaceAll(" ", "");
System.out.println("New string after removing spaces is "+newString);
System.out.println("Number of characters in string are "+newString.length());
}
}
