import java.util.*;
public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.print("enter number of queries: ");
        int q=sc.nextInt();
        int n=1000;
        int[] prefix=new int[n+1];
        prefix[0]=1;
        for(int i=1;i<n+1;i++)
        {
            prefix[i]=prefix[i-1]*i;
        }
        for(int i=0;i<q;i++)
        {
            int num=sc.nextInt();
            System.out.println("fact of num= "+prefix[num]);
        }
    }
}
