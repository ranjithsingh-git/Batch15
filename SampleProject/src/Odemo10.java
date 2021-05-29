
public class Odemo10 
{

	A getA(int x)
	{
		A a1 = new A();
		a1.i = x;
		a1.j = x+1;
		return a1;
	}
	public static void main(String[] args) 
	{
		Odemo10 d1 = new Odemo10();
		A x = d1.getA(4);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
		d1.getA(2);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
		x = d1.getA(2);
		System.out.println(x);
		System.out.println(x.i);
		System.out.println(x.j);
		
//		int i=d1.getA(6).i; // acceptable
//		int i=d1.getA(6);   // not acceptable as it returns address
//		A x2=d1.getA(6).i;  // not acceptable
//		A x2=d1.getA(6).funA(); // not acceptable as it is a non return type
//		int i=d1.getA(6).funA();
	}

}
