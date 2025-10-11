package ArrayExample;

import java.util.Arrays;

public class Add_an_element_at_the_end {
	
	
	public static void main(String[] args) {
		
		
		int [] arr = {20,42,6,25,30,88};
		
		int add = 40;
		
		int [] arr1 = new int [arr.length + 1];
		
		
		for(int i = 0 ; i < arr.length; i ++)
		{
			arr1[i] = arr[i];
		}
		
		
		arr1[arr1.length-1] = add;
		
		
		System.out.println(Arrays.toString(arr1));
		

	}

}
