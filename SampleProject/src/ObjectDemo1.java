
public class ObjectDemo1 
{
	int a = 10;
	boolean b = true;
	static int c = 20;
	
	public static void main(String[] args) 
	{
	  System.out.println(c); // variable c being non static and hence cant be used in main method
	  //System.out.println(a); var a being non static cant be used in main method, only non static members are initialized by jvm 
	  //System.out.println(b); var b being non static cant be used in main method, only non static members are initialized by jvm 
		
	  //declaration
	  ObjectDemo1 o1 =  new ObjectDemo1(); // instantiation
	  System.out.println(o1.a); //var a though non static for ObjectDemo1, are handled by ML while we create a new object of same class 
	  System.out.println(o1.b); //var b though non static for ObjectDemo1, are handled by ML while we create a new object of same class 
	  
	  ObjectDemo1 o2= new ObjectDemo1();
	  System.out.println(o2);
	  ObjectDemo1 o3;
	  
	}

}
