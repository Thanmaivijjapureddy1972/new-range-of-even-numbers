import java.util.*;
class Symbols
{
public static void main(String args[])
{
String  sm;
Scanner s=new Scanner(System.in);
System.out.println("enter String:");
sm=s.next();
int k=0,r=0,y=0,g=0;
char mr[]=sm.toCharArray();
for(int i=0;i<mr.length;i++)
{
if(Character.isUpperCase(mr[i]))
k++;
else if(Character.isLowerCase(mr[i]))
r++;
else if(Character.isDigit(mr[i]))
y++;
else
g++;
}
System.out.println("total number of upper case letters:"+k);
System.out.println("total number of lower case letters:"+r);
System.out.println("total number of digits:"+y);
System.out.println("total number of symbols:"+g);
if(k==r&&y==g)
System.out.println("YES");
else
System.out.println("NO");
}
}
