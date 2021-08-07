
class Geeks {
    
    static void bitWiseOperation(int a, int b, int c) {

        int d=0,f=0,g=0,e=0;
        d=a^a;
        System.out.println(d);
        e=c^b;
        System.out.println(e);
        f=a&b;
        System.out.println(f);
        g=c|(a^a);
        System.out.println(g);
        e=~e;
        System.out.println(e);
    }
}
