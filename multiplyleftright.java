public static int multiply (int arr[], int n)
{
        
        int  sum1=0,sum2=0;
        for(int i=0;i<n/2;i++)
        {
            sum1=sum1+arr[i];
        
        }
        for(int i=n/2;i<n;i++)
        {
            sum2=sum2+arr[i];
        }
        return sum1*sum2;
    }
    
    
}
