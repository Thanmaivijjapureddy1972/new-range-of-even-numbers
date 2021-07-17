import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter no. of elements: ");
        n=sc.nextInt();
        ArrayList<Integer> x1=new ArrayList<Integer>();
         ArrayList<Integer> x2=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            x1.add(sc.nextInt());
        }
        System.out.println("Enter value in  array,update value: ");
        int key=sc.nextInt();
        int updatevalue=sc.nextInt();
        int a;
        if(x1.contains(key))
            {
                a=x1.indexOf(key);
                x1.set(a,updatevalue);
                System.out.println("elements are: "+x1);
            }
        else  
         System.out.println("false");
	}
}
