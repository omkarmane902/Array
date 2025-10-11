package ArrayExample;

import java.util.Arrays;

public class Add_an_element_at_the_first {
	
	
	public static void main(String[] args) {
		
	int [] arr = {20,42,6,25,30,88};
		
		int add = 40;
		
		int [] arr1 = new int [arr.length + 1];
		
		arr1[0]=add;
		
		for(int i = 1 ; i < arr1.length ; i ++)
		{
			arr1[i] = arr[i-1];
		}
		
		System.out.println(Arrays.toString(arr1));
	}

}
