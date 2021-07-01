import java.util.Scanner;
public class Alphabet
{
public static void main(String[] args)
{
    int num, i, j, k=65 ;  
  System.out.println(" Enter the number of rows:"); 
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  
    for(i=1;i<=num;i++)
    {
    
        for(j=1;j<=i;j++)
        {
            System.out.print((char) k + " ");
                k++;;
        }
        
        System.out.println();
   }
}
}
