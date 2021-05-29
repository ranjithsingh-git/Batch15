
public class PolyDemo2 
{

	public static void main(String[] args) 
	{
	
		PolyDemo2 p1 = new PolyDemo2();
		p1.funA(10,20);
		p1.funA((long)10, 20);
		p1.funA(10, (long)20);
		p1.funA((long)10, (long)20);
	}
	
	void funA(int i, int j)
	{
	 System.out.println("int int args of PolyDemo2");
	}

	void funA(long i, long j)
	{
	 System.out.println("long long args of PolyDemo2");
	}

	void funA(int i, long j)
	{
	 System.out.println("int long args of PolyDemo2");
	}

	void funA(long i, int j)  // or ;long j in i
	{
	 System.out.println("long int args of PolyDemo2");
	}
}
