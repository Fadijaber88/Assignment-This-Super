package pkg1;

public class student 
{
	public student()
	{
		this(8,1,2);
		System.out.println("defaul parent");
	}
	
	public student(int a)
	{
		this();
		System.out.println("one para parent");
	}
	
	public student(int a, int b)
	{
		this(9);
		System.out.println("two para parent");
	}
	
	public student(int a, int b, int c)
	{
		System.out.println("three para parent");
	}
	

}
