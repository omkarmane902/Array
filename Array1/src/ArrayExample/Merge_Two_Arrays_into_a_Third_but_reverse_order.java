package ArrayExample;

import java.util.Arrays;

public class Merge_Two_Arrays_into_a_Third_but_reverse_order {
	
	
public static void main(String[] args) {
		
		
		int [] arr1 = {10,20,30,40,50};
		
		int [] arr2 = {60,70,80,90,100};
		
		int [] arr3 = new int[arr1.length + arr2.length];
		
		
		for(int i = 0 ; i < arr3.length ; i ++)
		{
			if(i < arr1.length)
			{
				arr3[i] = arr1[arr1.length-1-i];
			}
			else
			{
				arr3[i]= arr2[arr2.length - 1 - (i - arr2.length)];
			}
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
