package ArrayExample;

import java.util.Arrays;

public class Add_an_element_at_the_anywhere {
	
	
	public static void main(String[] args) {
		
		int [] arr = {20,42,6,25,30,88};
		
		int add = 40;
		int position = 3;
		
		int [] arr1 = new int [arr.length + 1];
		
		
		for(int i = 0 ; i < position ; i ++ )
		{
			arr1[i] = arr[i];
		}
		
		arr1[position] = add;
		
		
		for(int i = position  ; i < arr.length; i ++)
		{
			arr1[i + 1] = arr[i];
		}

	 
		
		System.out.println(Arrays.toString(arr1));
	}
	
	
}
