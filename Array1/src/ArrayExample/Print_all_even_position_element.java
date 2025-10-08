
public class Print_all_even_position_element {
	
	public static void main(String[] args) {
		
		Integer [] arr = {10,20,30,40,50};
		
		
		for(int i = 0 ; i < arr.length; i ++)
		{
			if (i % 2 == 0)
			{
				System.out.print(arr[i]  + " ");
			}
		}
		
		
		
	}

}
