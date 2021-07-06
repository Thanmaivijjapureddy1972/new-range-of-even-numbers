import java.util.*; 
public class duplicate 
{
  public static void main(String[] args) 
    {
        int arr[]= {2 , 5 , 6 , 3 , 4 , 8 , 3 , 5};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+arr[j]);
                }
            }
        }
    }    
}
