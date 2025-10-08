package ArrayExample;

public class array_is_Palindrome_or_not {
	
	
	public static void main(String[] args) {
		
		
		int [] arr = {10, 20, 30, 20, 10};
		
		
		for(int i = 0 ; i < arr.length / 2 ; i ++)
		{
			if(arr[i] != arr[arr.length -1 - i])
			{
				System.out.println("Array is Not Palindrome");
				
				return;
			}
		}
		
		System.out.println("Array is Palindrome");
		
	}

}
