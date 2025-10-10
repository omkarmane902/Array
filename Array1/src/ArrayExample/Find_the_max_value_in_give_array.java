package ArrayExample;


public class Find_the_max_value_in_give_array {

	
	
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,40,20,10,98,85,873,1,3,4};
		
		int maxvalue = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > maxvalue)
			{
				maxvalue = arr[i];
			}
		}
		System.out.println( "Max value in given array is : "+maxvalue);
	}
}
