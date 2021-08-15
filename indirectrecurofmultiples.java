public class Main
{
    static final int N=50;
    static int n=5;
    public static void fun1()
    {
        if(n<=N)
        {
            System.out.printf("%d",n);
            n+=5;
            fun2();
        }
    }
     public static void fun2()
    {
        if(n<=N)
        {
            System.out.printf("%d",n);
            n+=5;
            fun1();
        }
    }
    public static void main(String args[])
    {
        fun1();
    }
}
