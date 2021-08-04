class Solution {
    static long nthFibonacci(long n){
        // code here
        int m=(int)n;
         long prefix[]=new long[m+1];
        prefix[0]=0;
        prefix[1]=1;
        for(int i=2;i<m+1;i++)
        {
            prefix[i]=(prefix[i-1]+prefix[i-2])% 1000000007;
        }
        return prefix[m];
    }
}
