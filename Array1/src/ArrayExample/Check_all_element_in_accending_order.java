package ArrayExample;

public class Check_all_element_in_accending_order {
	
	
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40,50};
		
		
		for(int i = 0; i < arr.length -1; i ++)
		{
			if(arr[i] > arr[i +1])
			{
				System.out.println("Array is not accending order");
				return;
			}
			
			
		}
		      System.out.println("Array is  accending order");
	}

}
