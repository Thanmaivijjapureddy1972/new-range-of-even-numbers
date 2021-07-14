import java.util.*;
import java.lang.*;

class Online
{
	public static void main(String args[])
	{
		StringBuffer s= new StringBuffer();
		Scanner sc= new Scanner(System.in);
		s.append(sc.nextLine());
		int q=sc.nextInt();
		for(int i=1;i<=q;i++)
		{
			int ind=sc.nextInt();
			char ch=sc.next().charAt(0);
			s.setCharAt(ind-1,ch);
		}
		StringBuffer str=new StringBuffer(s);
		int m=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
			int a=sc.nextInt(),b=sc.nextInt(),ans=0;
			StringBuffer upd=new StringBuffer();
			upd.append(s.substring(a-1,b));
			upd.reverse();
			s.replace(a-1,b,upd.toString());
		}
		int ans=0;
		System.out.println(str);
		System.out.println(s);
		for(int i=0;i<s.length();i++)
		{
			if(str.charAt(i)==s.charAt(i))
				ans++;
		}
		System.out.println(ans);
	}
}
