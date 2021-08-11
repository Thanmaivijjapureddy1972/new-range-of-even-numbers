import java.util.*;
public class Shellsort
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
            for(int i=0;i<n;i++)
            {	
                for(int j=i+1;j<n;j++)	
                {
                    if(m[i]>m[j])	
                    {	
                        temp=m[i];
                        m[i]=m[j];	
                        m[j]=temp;	
                        }	
                        }
                        }	
                        System.out.print("After sorting :"); for(int i=0;i<n;i++) 
                        System.out.print(m[i]+" ");
                        }
}
