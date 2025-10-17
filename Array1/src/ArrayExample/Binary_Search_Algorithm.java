package ArrayExample;

public class Binary_Search_Algorithm {
	
	
	public static void main(String[] args) {
		
		int [] arr = {2, 3, 7, 9, 10, 11, 12, 16, 17, 21};
		
		int Element = 12;
		
		  int ans =  searchElement(arr, Element);
		
		if(ans != -1)
		{
			System.out.println("Element found at index: " + ans);
		}
		else
		{
			 System.out.println("Element not found");
		}
		
	}
	
	
	public static int searchElement (int [] arr , int Element)
	{
		int Start = 0;
		int end = arr.length -1;
		
		while(Start <= end)
		{
			int mid = (Start + end)/2;
			
			if(Element == arr[mid])
			{
				return mid;
			}
			else if(arr[mid]>Element)
			{
				end = mid-1;
			}
			else
			{
				Start = mid+1;
			}
		}
		
		return -1;
	}

}
