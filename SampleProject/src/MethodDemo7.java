
public class MethodDemo7 
{

	public static void main(String[] args)
	{
        System.out.println("Main method of MethodDemo7");
        MethodDemo7 m1 = new MethodDemo7();
        m1.funB();
        System.out.println("Done");
	}

	void funA()
	{
		System.out.println("FunA method of MethodDemo7");
	}
	
	void funB()
	{
		System.out.println("FunB method of MethodDemo7");
		MethodDemo7 m1 = new MethodDemo7();
		m1.funA();
	}
	
}
