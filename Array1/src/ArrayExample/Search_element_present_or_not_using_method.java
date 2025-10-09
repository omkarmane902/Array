package ArrayExample;

public class Search_element_present_or_not_using_method {

	public static void main(String[] args) {
		
		 int [] arr = {10,20,30,40,50,60};
		 int search = 50;
		 
		 int result = ElementPresentorNot(arr, search);
		 
		 if(result == -1)
		 {
			 System.out.println( search+" :is not present in the array");
		 }
		 else {
			 System.out.println( search+" :is present in the array");
			 
		 }
		
		
	}
	
	public static int  ElementPresentorNot( int [] arr , int search)
	{
	     for(int i = 0 ; i < arr.length; i ++)
	     {
	    	 if(arr[i] == search)
	    	 {
	    		return i; 
	    	 }
	     }
	     return -1;
	}
}
