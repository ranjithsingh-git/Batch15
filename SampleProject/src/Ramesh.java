
public class Ramesh 
{

	public static void main(String[] args) 
	{
		Ramesh r1 = new Ramesh();
		r1.addNumbers();
		r1.addNumbers2();
		r1.addNumbers3(50, 60);
		r1.addNumbers3(90, 110);

	}
	
	
	void addNumbers()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	
	void addNumbers2()
	{
		int a = 30;
		int b = 40;
		int c = a+b;
		System.out.println(c);
		
	}
	
	void addNumbers3(int a, int b)
	{
		int c = a + b;
		System.out.println(c);
	}

}

