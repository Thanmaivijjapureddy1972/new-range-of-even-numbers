import java.util.*;
public class Selectionsort
{
    public static void main(String[] args)
    {	 
        Scanner sc=new Scanner(System.in);	
        System.out.println("enter no. of elements: ");
        int n=sc.nextInt();	
        System.out.print("enter the elements: ");	
        int m[]=new int[n];	
        int temp;	
        for(int i=0;i<n;i++)	
        {	
            m[i]=sc.nextInt();	
            }	
            int min;	
            for(int i=0;i<n;i++)
            {	
                min=i;	
                for(int j=i+1;j<n;j++)
                {	
                    if(m[min]>m[j])	
                    {
                        min=j;	
                        }	
                        }		 
                        temp=m[i];	
                        m[i]=m[min];
                        m[min]=temp;
                        }	
                        System.out.print("After sorting :"); for(int i=0;i<n;i++) 
                        System.out.print(m[i]+" ");	
                    }
}
