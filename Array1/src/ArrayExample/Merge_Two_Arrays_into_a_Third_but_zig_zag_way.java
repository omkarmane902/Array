package ArrayExample;

import java.util.Arrays;

public class Merge_Two_Arrays_into_a_Third_but_zig_zag_way {
	
	
public static void main(String[] args) {
		
		
		int [] arr1 = {10,20,30,40,50};
		
		int [] arr2 = {60,70,80,90,100};
		
		int [] arr3 = new int[arr1.length + arr2.length];
		
		
		int arr1Index = 0 ;
		int arr2Index = 0 ;
		
		
		for(int i = 0 ; i < arr3.length ; i ++)
		{
			if( i % 2 == 0)
			{
				  arr3[i] = arr1[arr1Index];
				  arr1Index++;
			}
			else
			{
				arr3[i] = arr2[arr2Index];
				arr2Index ++;
			}
		}
		
		System.out.println(Arrays.toString(arr3));
	}

}
