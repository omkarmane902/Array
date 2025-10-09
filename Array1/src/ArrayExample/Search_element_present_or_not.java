package ArrayExample;

public class Search_element_present_or_not {

	
	
	public static void main(String[] args) {
		
		
		int [] arr = {10,20,30,40,50,60};
		
		int search = 50;
		
		 
		int i ;
		
		for( i = 0 ; i < arr.length; i++)
		{
			if ( arr[i]==search)
			{
				break;
			}
		}
		
		if(i == arr.length)
		{
			System.out.println(search + " Element is not found !");
		}
		else
		{
			System.out.println(search +" Element is found !");
		}
		
	}
}
