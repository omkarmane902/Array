package ArrayExample;

public class Find_the_Second_min_value_in_give_array {
	
	public static void main(String[] args) {
		
		
		int [] arr = {20,42,6,25,30,88};
		
		int min1 = 0;
		
		int min2 = 0;
		
		
		if(arr[0]<arr[1])
		{
			min1 = arr[0];
			min2 = arr[1];
		}
		else
		{
			min1 = arr[1];
			min2 = arr[0];
		}
		
		for(int i = 2 ; i < arr.length; i++)
		{
			if(arr[i]< min1)
			{
				min2 = min1;
				
				min1 = arr[i];
			}
			else if(arr[i]<min2)
			{
				min2 = arr[i];
			}
		}
		
		System.out.println("The Second max value in give array is : "+min2);
	}
	

}
