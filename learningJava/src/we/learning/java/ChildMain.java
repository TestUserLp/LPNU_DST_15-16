package we.learning.java;

public class ChildMain extends Main {
	
	public static int staticPrivate;
	
	public void test()
	{
		this.protect = 1;
		this.power(1, 1);
		
		Main x = new Main();
		
		x.power(11, 1);
		
		ChildMain.staticPrivate = 1;
		
	}
	
	int power(int y, int pow111){
		return y;
	}
	
	public static int powerStatic(int x, int pow){
		return x*pow+1;
	}
}
