import java.util.*;
import java.util.Scanner;
public class rotate 
{
public static void main(String[] args) {
int[] input = { 1, 2, 3, 4, 5, 6, 7, 8 };
int n = 3;
System.out.println("Rotate given array " + Arrays.toString(input)
        + " by 3 places to the left.");

   int[] rotatedArray = rotateLeft(input, input.length, n);
System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
System.out.println("Rotate given array " + Arrays.toString(input)
        + " by 3 places to the right.");
  rotatedArray = rotateRight(rotatedArray, rotatedArray.length, n);
System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
}
public static int[] rotateLeft(int[] input, int length, int numOfRotations)
{
for (int i = 0; i < numOfRotations; i++) 
{
int temp = input[0];
for (int j = 0; j < length - 1; j++) 
{
input[j] = input[j + 1];
} 
input[length - 1] = temp;
    }
    return input;

  }

 
  public  static int[] rotateRight(int[] input, int length, int numOfRotations) {
    for (int i = 0; i < numOfRotations; i++) {

      
      int temp = input[length - 1];
      for (int j = length - 1; j > 0; j--) {

        
        input[j] = input[j - 1];
      }
      input[0] = temp;
    }
    return input;

  }

}
