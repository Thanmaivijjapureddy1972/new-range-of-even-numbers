import java.util.*;
public class map1 
{
public static void main(String[] args)
{
int[] arr = {4,4,5,5,6};
int n = arr.length; 
HashMap<Integer,Integer> x=new HashMap<Integer,Integer>();
for (int i = 0; i < n; i++) 
{
if (x.containsKey(arr[i])) 
{
int c = x.get(arr[i]);
x.replace(arr[i], c + 1);
}
else
x.put(arr[i], 1);
}
for (Map.Entry<Integer, Integer> i : x.entrySet())
{
if (i.getValue() > 1)
System.out.println(i.getKey() + "->"+ i.getValue());
else
continue;
}
}
}
