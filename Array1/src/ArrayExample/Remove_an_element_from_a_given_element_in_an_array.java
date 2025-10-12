package ArrayExample;

import java.util.Arrays;

public class Remove_an_element_from_a_given_element_in_an_array {
	
	public static void main(String[] args) {
		
		
int [] arr = {20,42,6,25,30,88};
		
		int index = 0;
		int remove = 25;
		
		int [] arr1 = new int [arr.length - 1];
		    
		int i;
		
		for( i = 0 ; i < arr.length ; i++)
		{
			if(arr[i]== remove)
			{
				
				break;
			}
			index ++;
		}
		
		for(int j = 0 ; j<arr.length ; j++)
		{
		  	if(j<index)
		  	{
		  		arr1[j]= arr[j];
		  	}
		  	else if(j>index)
		  	{
		  		arr1[j -1] = arr[j];
		  	}
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
