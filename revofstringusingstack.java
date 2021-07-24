import java.util.Stack;
import java.util.*;
public class reversestring
{
    public static void main(String args[])
    {
    String str = "Computer";
    Stack<Character> st = new Stack<Character>();
    for(int i=0;i<str.length();i++)
    {
        st.push(str.charAt(i));
    }
    while(st.isEmpty()==false)
    {
        Character ch = st.pop();
        System.out.println(ch);
    }
}
}
