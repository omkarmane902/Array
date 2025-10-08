package ArrayExample;

public class Print_array_reverse_order {
    
	
	public static void main(String[] args) {
		
		
		
		Integer [] arr = {10,20,30,40,50};
		
		
		
		for(int i = arr.length-1 ; i >= 0 ; i --)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}
