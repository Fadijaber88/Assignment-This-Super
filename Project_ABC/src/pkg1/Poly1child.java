package pkg1;

public class Poly1child extends Poly1 
{
	public void Poly(int a, int b)
	{
		int d = a - b;
		System.out.println("Child Class,"+d);
	}
	public static void main(String[] args) 
	{
		Poly1child obj=new Poly1child();
		obj.Poly(4, 1);

	}
}
