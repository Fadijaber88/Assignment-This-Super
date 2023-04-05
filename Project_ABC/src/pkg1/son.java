package pkg1;

public class son extends student
{
	public son()
	{
		this(4,6);
		System.out.println("Default child");
	}
	
	public son(int a)
	{
		this(1,2,3);
		System.out.println("One paramearized child");
	}
	
	public son(int a, int b)
	{
		super(1,2);
		System.out.println("two para child");
	}
	
	public son(int a, int b, int c)
	{
		this();
		System.out.println("three para child");
	}
	
	public static void main(String[] args) 
	{
		son s3=new son(1);
	}
	
}