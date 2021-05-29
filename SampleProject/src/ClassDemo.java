
public class ClassDemo 
{
	int i = 5;
	
	void funA()
	{
		
	}
	
	void funB()
	{
		System.out.println(i);
		funA();
	}

	public static void main(String[] args) 
	{
		ClassDemo c1 = new ClassDemo();
		c1.funB();

	}

}
