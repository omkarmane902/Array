package Array_non_primitive;

public class array_non_primitive_ {
	
	String brand;
	String size;
	double price;
	
	
	
	public array_non_primitive_() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public array_non_primitive_(String brand,String size,double price)
	{
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	
	public void printarray_non_primitive()
	{
		System.out.println("Brand : " + brand);
		System.out.println("Size : " + size);
		System.out.println("Price : " + price);
		
	}
	
	
	public String toString ()
	{
		return "Brand: " + brand + ", Size: " + size + ", Price: " + price;
	}
	

}
