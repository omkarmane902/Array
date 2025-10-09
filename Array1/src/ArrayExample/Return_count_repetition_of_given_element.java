package ArrayExample;

public class Return_count_repetition_of_given_element {
	
	
	public static void main(String[] args) {
		
		int [] arr = {10,20,30,40,50,40,30,10,40,70,60,70 };
		
		int search = 40;
		
		int count = 0 ;
		
		for(int i = 0 ; i < arr.length ;  i ++)
		{
			if(arr[i] == search)
			{
			    count ++ ;	
			}
			
		}
		
		System.out.println("Count of given element is : " + count);
	}

}
