
public class ODemo6A 
{
	int x = 4;
	A a1 = new A();
	ODemo6A d1;
	

	public static void main(String[] args) 
	{
		System.out.println("start");
		ODemo6A d1 = new ODemo6A();
		System.out.println(d1.x);
		System.out.println(d1.d1);
		
		d1.d1 = new ODemo6A();
		
		d1.d1.d1 = new ODemo6A();
		int x = 6;
		d1.d1.d1.x = x;
		
		d1.d1.d1.d1 = d1;
		
		d1.d1.d1.d1.x = 3;
		System.out.println(d1);
		System.out.println(d1.d1.d1.d1);
		System.out.println(d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.d1.x);
		System.out.println(d1.d1);
		System.out.println(d1.d1.d1);
		
	}

}
