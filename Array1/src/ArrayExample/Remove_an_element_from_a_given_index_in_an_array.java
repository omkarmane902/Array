package ArrayExample;

import java.util.Arrays;

public class Remove_an_element_from_a_given_index_in_an_array {
	
	public static void main(String[] args) {
		
		
		int [] arr = {20,42,6,25,30,88};
		
		
		int index = 3;
		
		int [] arr1 = new int [arr.length - 1];
		
		
		for(int i = 0 ; i < arr.length; i++)
		{
			if(i < index)
			{
				arr1[i] = arr[i];
			}
			else if(index < i)
			{
				arr1[i-1] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
		
		
	}

}
