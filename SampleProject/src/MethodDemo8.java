
public class MethodDemo8 
{
	//public static void main(String[] args)  //Error: Main method not found in class MethodDemo8, please define the main method as:
	//{
	//	MethodDemo8 m1 = new MethodDemo8();
	//	m1.funA();
	//	m1.funB();
		
	//}
	void funA()
	{
	System.out.println("funA of MethodDemo8");
	return;
	//System.out.println("funA of MethodDemo8");	no statement after return will be executed, throws complile time error
	}
	
	int funB()
	{
	System.out.println("funB of MethodDemo8");
	return 10;
	//System.out.println("funB of MethodDemo8");	no statement after return will be executed, throws complile time error
	}

}
