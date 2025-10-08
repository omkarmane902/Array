package ArrayExample;

public class Sum_of_all_element {
	
	
	public static void main(String[] args) {
		
		
		Integer [] arr = {10,20,30,40,50};
		
		
		int sum = 0 ;
		
		for(int i = 0 ; i < arr.length ;  i ++)
		{
			
			sum += arr[i];
		}
		
		System.out.println("Sum of all array is : "+sum);
		
		
		
	}

}
