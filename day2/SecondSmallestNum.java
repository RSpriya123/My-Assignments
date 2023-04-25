package week1.day2;
import java.util.Arrays;

public class SecondSmallestNum {

	public static void main(String[] args) {
		int arr[] = {23,45,67,32,89,22};
	      int size = arr.length;
	      System.out.println("The length of the array is:"+size);
	      Arrays.sort(arr);
	      System.out.println("sorted Array ::"+Arrays.toString(arr));
	      int num = arr[1];
	      System.out.println("2nd smallest element is ::"+num);
	   }
	
	}


