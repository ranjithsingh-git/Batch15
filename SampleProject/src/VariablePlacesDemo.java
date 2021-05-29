

public class VariablePlacesDemo 
{
    int i = 10; //second place as instance variable
    static int j = 20; ////fifth place as static variable
	
    
    public static void main(String[] args) 
	{
	
		int i = 10; //first place as local variable
	}

    
    void funA(int i)////third place as parameterized variable
    {
    	
    }
    
    int funB()
    {
    	int i = 10;
    	return i; ////fourth place as return variable
    }
}

