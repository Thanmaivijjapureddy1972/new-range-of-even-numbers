import java.util.*;
import java.util.Scanner;
public class Map2
{                          
public static void main(String args[])
 {  
TreeMap<Integer,String>x=new TreeMap<Integer,String>();    
x.put(5,"John");    
x.put(1,"Sam");    
x.put(7,"Kim");    
for (Map.Entry<Integer, String> i : x.entrySet())
{
System.out.println(i.getKey() + " " + i.getValue());
} 
}
}
