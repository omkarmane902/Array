package ArrayExample;

import java.util.Arrays;

public class Right_side_rotated_array {
   public static void main(String[] args) {
	
	   
	   int [] arr = {10,20,30,40,50};
	   
	   
	   int temp = arr[arr.length - 1];
	   
	    
	   
	   for (int i = arr.length - 1; i > 0; i--)
	   {
		    arr[i] = arr[i - 1] ;
	   }
	   arr[0] = temp;
	   
	   
	   System.out.println(Arrays.toString(arr));
}
}
