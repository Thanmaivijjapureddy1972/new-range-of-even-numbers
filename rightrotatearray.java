import java.util.Arrays;
import java.util.Scanner;
class rarr
{
	public static void rightRotateByOne(int[] a)
	{
		int last = a[a.length - 1];
		for (int i = a.length - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}

		a[0] = last;
	}
	public static void rightRotate(int[] a, int k)
	{
		for (int i = 0; i < k; i++) {
			rightRotateByOne(a);
		}
	}

	public static void main(String[] args)
	{
            Scanner in=new Scanner(System.in);
            
		int[] a ={1,2,3,4,5,6,7};
		int k=3;
           
		rightRotate(a,k):
    System.out.println(Arrays.toString(a));
	}
}
