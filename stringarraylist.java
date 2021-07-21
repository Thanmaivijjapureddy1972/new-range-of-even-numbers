import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	    System.out.println("enter the no. of elements:");
	    int n=sc.nextInt();
	    ArrayList<Integer> x=new ArrayList<Integer>();
	    System.out.print("enter the elements: ");
	    for(int i=0;i<n;i++)
	    {
	        x.add(sc.nextInt());
	    }
        Iterator<Integer> z=x.iterator();
        System.out.println("enter the value: ");
	   	int k=sc.nextInt();
        while(z.hasNext()) 
        {
            if(z.next()<=k)
            z.remove();
        }
         System.out.print(x);
	}
}
