public class MethodDemo7A 
{

	public static void main(String[] args)
	{
        MethodDemo7A m1 = new MethodDemo7A();
        m1.funB(); //funA will call from m1 variable m1.funA

        MethodDemo7A m2 = new MethodDemo7A();
        m2.funB(); //funA will call from m2 variable m2.funA
        
	}

	void funA()
	{
		System.out.println("FunA method of MethodDemo7A");
	}
	
	void funB()
	{
		System.out.println("FunB method of MethodDemo7A");
		funA(); //taking from funB current object and need not create a new object.Non static members can be directly called from non-static
	}
	
}
