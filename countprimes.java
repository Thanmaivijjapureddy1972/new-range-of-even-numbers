class Solution {
public int countPrimes(int n) {
int thanu[] = new int[n];
for (int i=2; i <n; i++)
{
for(int j=i+i;j<n;j=j+i)
{
thanu[j]=1;
}

    }
    int result=0;
    for(int i=2;i<thanu.length;i++)
    {
        if(thanu[i]==0)
        {
            result++;
        }
    }
      return result;
}
}
