public class MoveZerostolastposition
{
	 static void moveZeroElementToEnd(int arr[])
	 {  
		 int size = arr.length;  
	     int count = 0;  
	     
	     for (int i = 0; i < size; i++)
	     {  
	    	 if (arr[i] != 0)
	    	 {  
	             arr[count++] = arr[i];  
	         }  
	     }  
	  
	     while (count < size)  
	     arr[count++] = 0;  
	 }  
	  
	 public static void main(String[] args) 
	 { 
	     int arr []= {5, 1, 6, 0, 0, 3, 9, 0, 6, 7, 8, 12, 10, 0, 2};  
	     moveZeroElementToEnd(arr);
	     
	     System.out.print("Array after moving zeros to end : ");  
	  
	     for (int i = 0, size = arr.length; i < size; i++)  
	     System.out.print(arr[i] + " ");  
	 }  
}
