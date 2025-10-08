package ArrayExample;

import java.util.Arrays;

public class Copy_an_array_into_dublicate_array {
	
	public static void main(String[] args) {
		
		
		
		Integer [] arr = {10,20,30,40,50};
		
		int [] arr2 = new int [arr.length];
		
		for(int i = 0 ; i < arr.length;  i ++)
		{
			arr2[i] = arr[i];
		}
		
		
		System.out.println(Arrays.toString(arr));
	}

}
