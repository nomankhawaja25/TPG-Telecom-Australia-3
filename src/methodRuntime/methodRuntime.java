package methodRuntime;

public class methodRuntime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		
		// Put the Class and Method here  // class.method();
		
		Foo.aMethod();
		long time = System.currentTimeMillis() - start;
		
		System.out.println("Total time the method took is: " + time + " MilliSeconds");
		

	}
	
static class Foo
{
	static void aMethod()
	{
		int x = 0;
		for (int i = 10; i < 10000; i++)
		{
			for (int f = 10; f < 10000; f++)
			  x = 5 * 5000 + 7 - 4 * 9999;
		}
	}
}

}
