import java.util.*;
public class Stringfrequency
{
	public static void main(String[] args) {
        HashMap<String,Integer> x=new HashMap<String,Integer>();
        String[] str= {"Rama","Gita","Rama","Lakshmi","Rama","Gita","Lakshmi","Sita","Lakshmi"};
        for(int i=0;i<str.length;i++)
        {
            String key;
            key=str[i];
            if(x.containsKey(key))
            x.put(key,x.get(key)+1);
            else
            x.put(key,1);
        }
        for (Map.Entry<String, Integer> i : x.entrySet())
        {
            if(i.getValue()>2)
            System.out.println(i.getKey() + "=" + i.getValue());
        }
	}
}
