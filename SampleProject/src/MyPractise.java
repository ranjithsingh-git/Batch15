
public class MyPractise 
{

	int x = 10;
	static int y = 20;
	static int l = funA();
	public static void main(String[] args) 
	{
		int x = 5;
		System.out.println(x);
		System.out.println(y);
		MyPractise m = new MyPractise();
		System.out.println(m.x);
		System.out.println(l);
	}

	static int funA()
	{
		int r = 12;
		System.out.println(r);
		return r;
	}
}
