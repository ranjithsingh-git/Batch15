
public class ObjectFlowDemo1 
{
	A a1 = new A();
	static ObjectFlowDemo1 o1 = new ObjectFlowDemo1();
	static int b = 20;
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		ObjectFlowDemo1 o1 = new ObjectFlowDemo1();
		System.out.println(a1.i);
		System.out.println(o1.a1.i);
		System.out.println(ObjectFlowDemo1.o1.a1.i);
		System.out.println(b);
		o1.funA();
	}
	
	void funA()

	{
		System.out.println("Done");
	}
	
	void funB()

	{
		System.out.println("D");
	}
	
	void funA(int c)

	{
		c = 20;
		//z = c
	}
	
}
