class Solution {
    public int[] plusOne(int[] digits) 
    {
        int flag =0;
        int sum=0;
        int carry=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(flag==0)
            { 
                flag=1;
                if(digits[i]<9)
                {
                    digits[i]+=1;
                    return digits;
                }else
                {
                    digits[i]=0;
                    carry=1;
                }
            }
            else
            {
                sum = digits[i]+carry; 
                if(sum>9)
                { 
                    digits[i]=0;
                    carry=1;
                }
                else
                { 
                    digits[i]=sum;
                    carry=0; 
                    return digits;
                }
            }
        }
        
        if(carry>0)
        { 
           
            int [] arr = new int [digits.length+1];
            arr[0]=carry;
            for(int i=1;i<arr.length;i++)
                arr[i]=digits[i-1];
            return arr;
        }
        return null; 
    }
}
