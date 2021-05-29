// only main method would be executed by JVM and no other function executes, we have to explicitly call them 

public class MethodsDemo1 {

	public static void main(String[] args) 
	{
	
		System.out.println("main method of MethodsDemo1");
	}

	void funA()
	{
		System.out.println("funA of MethodsDemo1");
	}
	
	void funB()
	{
		System.out.println("funB of MethodsDemo1");
	}
	
	static void funC()
	{
		System.out.println("funC of MethodsDemo1");
	}
	
}

