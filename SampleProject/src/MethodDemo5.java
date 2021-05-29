
public class MethodDemo5 
{

	public static void main(String[] args)
	{
        System.out.println("Main method of MethodDemo5");
        MethodDemo5 m1 = new MethodDemo5();
        m1.funB();
        System.out.println("Done");
	}

	static void funA()
	{
		System.out.println("FunA method of MethodDemo5");
	}
	
	
	void funB()
	{
		System.out.println("FunB method of MethodDemo5");
		funA();
	}
	
}
