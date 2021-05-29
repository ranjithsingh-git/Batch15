
public class MethodDemo9 
{

	public static void main(String[] args) 
	{
        MethodDemo9 m1 = new MethodDemo9();
        m1.funA();
        m1.funB();
		
	}

	
	void funA() 
	{
	System.out.println("funA of MethodDemo9");
	int a = 10;
	int b = 20;
	int c = a + b;
	System.out.println(c);
	}
	
	int funB()                //return function 
	{
	System.out.println("funA of MethodDemo9");
	int a = 10;
	int b = 20;
	int c = a + b;
	System.out.println(c);
	return 300; //c; //b; //a;
	}
	
}
