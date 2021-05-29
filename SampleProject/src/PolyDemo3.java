
public class PolyDemo3 
{

	public static void main(String[] args) 
	{
		PolyDemo3 p1 = new PolyDemo3();
		A k = new A();
		p1.funA(k);
		p1.funA(new A());
		//p1.funA(null);
		
		B l = new B();
		p1.funA(l);
		p1.funA(new B());
		
		C m = new C();
		p1.funA(m);
		p1.funA(new C());
	}

	void funA(A a1)
	{
		System.out.println("class A function of PolyDemo3");
		System.out.println(a1);
	}

	void funA(B a1)
	{
		System.out.println("class A function of PolyDemo3");
		System.out.println(a1);
	}
	
	void funA(C a1)
	{
		System.out.println("class A function of PolyDemo3");
		System.out.println(a1);
	}

}
