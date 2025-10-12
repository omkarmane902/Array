package ArrayExample;

import java.util.Arrays;

public class Adding_an_array_at_a_specific_index_in_another_array {

	
	public static void main(String[] args) {
		
		
		int [] arr1 = {10,20,30,70,80,90};
		int [] arr2 = {40,50,60};
		
		int [] arr3 = new int[arr1.length + arr2.length];
		
		
		int index = 3;
		
		int  i = 0 , j = 0 , k = 0;
		
		for (i = 0; i < arr3.length; i++) {
			
			
			if(i < index)
			{
				arr3[i] = arr1[j];
				
				j++;
			}
			else if ( k < arr2.length)
			{
				arr3[i] = arr2[k];
				k++;
			}
			else 
			{
				arr3[i] = arr1[j];
				j++;
				
			}
		}
		
		System.out.println(Arrays.toString(arr3));
		
	}
}
