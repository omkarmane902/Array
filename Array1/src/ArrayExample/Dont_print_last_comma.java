package ArrayExample;

public class Dont_print_last_comma {
	
	public static void main(String[] args) {
		
		String [] arr = {"omkar","dhanaji","mane","sangita", "pooja"};
		
		  
		
		for(int i = 0 ; i < arr.length ; i ++)
		{
			  if (i < arr.length -1)
			  {
				  System.out.print( arr[i] + ",");
			  }
			  else
			  {
				  System.out.print(arr[i]);
			  }
		}
		
	}

}
