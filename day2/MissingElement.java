package week1.day2;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				Arrays.sort(arr);
			    System.out.println("sorted Array ::"+Arrays.toString(arr));
				

				// loop through the array (start i from arr[0] till the length of the array)
			    for (int i=1; i<= arr.length+1;i++)

					// check if the iterator variable is not equal to the array values respectively
					
			    	if(i!=arr[i-1]) {
			    		
			    		
						// print the number
			    		System.out.println("The missing number is "+i);
						
						// once printed break the iteration
			    		break;
			    	}
	}

}
