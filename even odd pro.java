import java.util.*;
public class HelloWorld{

     public static void main(String []args){
         int i=0;
       Scanner sc=new Scanner(System.in);
       char m;
       m=sc.next( ).charAt(0);
       switch(m)
       {
     case 'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :i++;
       }
       if(i==1)
	System.out.println("Vowel");
	else 
		if((m>='a'&&m<='z')||(m>='A'&&m<='Z'))
		System.out.println("Consonent");
	}
}
