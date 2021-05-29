
public class ThisDemo3 
{
	ThisDemo3 funA()
	{
		System.out.println("funA of ThisDemo3");
		ThisDemo3 t1 = new ThisDemo3();
		return t1;
	}

	
	ThisDemo3 funB()
	{
		System.out.println("funB of ThisDemo3");
		return new ThisDemo3();
	}
	
	ThisDemo3 funC()
	{
		System.out.println("funC of ThisDemo3");
		return this;
	}
	
		public static void main(String[] args)
	{
			//ThisDemo3 t1 = new ThisDemo3();
            //t1.funA();
			//t1.funB();
			//t1.funC();
			

	}

}
