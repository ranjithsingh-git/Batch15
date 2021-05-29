
public class PolyDemo1 
{

	public static void main(String[] args) 
	{
		PolyDemo1 p1 = new PolyDemo1();
		p1.funA();
		p1.funA(10);
		p1.funA(10.23);
		p1.funA(10.23f);
		

	}
	
	void funA()
	{
		System.out.println("Zero orgs of PolyDemo1");
	}

	void funA(int i)
	{
		System.out.println("int orgs of PolyDemo1");
	}
	
	void funA(long l)
	{
		System.out.println("long orgs of PolyDemo1");
	}
	
	void funA(float f)
	{
		System.out.println("float orgs of PolyDemo1");
	}
	
	void funA(double l)
	{
		System.out.println("double orgs of PolyDemo1");
	}
}
