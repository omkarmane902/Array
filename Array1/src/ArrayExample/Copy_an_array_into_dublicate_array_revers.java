package ArrayExample;

import java.util.Arrays;

public class Copy_an_array_into_dublicate_array_revers {
	
	
	public static void main(String[] args) {
		
		
		 int [] arr1 = {10,20,30,40,50};
		 
		 int [] arr2 = new int [arr1.length];
		 
		 
		 for(int i = 0 ; i < arr1.length ; i ++ )
		 {
			 arr2[arr2.length-1 - i] = arr1[i];
		 }
		 
		 
		 System.out.println(Arrays.toString(arr2));
		 
	}

}
