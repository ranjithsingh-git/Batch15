
public class VariableDemo 
{
	int a = 10; // non-static variable or instance variable
	static int b = 20; // static variable
	
	
	public static void main(String[] args) 
	{
	
		int c = 30; //local variable 
	 // int c = 40; //dulpcate local variable
		int a = 50; //non-duplicate though we have same at class level
		System.out.println(a);
		System.out.println(b);
	}

}
