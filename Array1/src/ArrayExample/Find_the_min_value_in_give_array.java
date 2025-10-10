package ArrayExample;

public class Find_the_min_value_in_give_array {
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,40,20,10,98,85,873,1,3,4};
		
		
		int minvalue = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < arr.length; i ++)
		{
			if(arr[i] < minvalue)
			{
				 minvalue = arr[i];
			}
		}
		System.out.println("Min value in given array is : "+minvalue);
	}

}
