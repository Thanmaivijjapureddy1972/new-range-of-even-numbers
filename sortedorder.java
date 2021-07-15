import java.util.*;
public class Array1 
{
public static void main(String args[])
{
ArrayList<Integer>list1 = new ArrayList<Integer>();
ArrayList<Integer>list2 = new ArrayList<Integer>();  
list1.add(10);
list1.add(20);
list1.add(35);
System.out.println("ArrayList 1: "+ list1);
list2.add(60);
list2.add(100);
System.out.println("ArrayList 2: "+list2);
list1.addAll(list2);
System.out.println("\n Joined ArrayLists: "+list1);
}
}
