
public class VariableDemo3 
{
	int i = 10;
	static int j = 20;
	
	public static void main(String[] args) 
	{
      System.out.println(j);
      j = 30;
      System.out.println(j);
      //declaration
      int j = 40;  //initialization
      System.out.println(j);
      // System.out.println(k);
      // System.out.println(i);  //throws error as its not static variable, we need to load it in the main method
      
      //declaration
      VariableDemo3 v1 =  new VariableDemo3(); //instantiation
      System.out.println(v1.i);
      

	}

}
