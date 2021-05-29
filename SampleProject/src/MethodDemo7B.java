
public class MethodDemo7B 
{

	public static void main(String[] args) 
	{
		MethodDemo7B m1 = new MethodDemo7B();
		m1.funA(2, 6);
		m1.funB(2147483648L , 2147483647); //got to specify the datatype in value to be implicitly considered
		m1.funC(334.5f, 230.5f);
		m1.funD(234.5d, 880.5d);
		m1.funE('C');
		m1.funF(false);
	}

	void funA(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}
	
	void funB(long a, long b)
	{
		long c = a + b;
		System.out.println(c);
				
	}
	
	void funC(float a, float b)
	{
		float c = a - b;
		System.out.println(c);
	}
	
	void funD(double a, double b)
	{
		double c = a + b;
		System.out.println(c);
	}
	
	void funE(char a)
	{
		System.out.println(a);
		
	}
	
	void funF(boolean a)
	{
		System.out.println(a);
		
	}
}
