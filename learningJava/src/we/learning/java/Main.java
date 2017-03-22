package we.learning.java;

class Main {
	private static int nextId = 0;
	
	public final int id = Main.nextId++;
	
	private int privat;
	protected int protect;
	int defau;
	public int publ;
	
	public static int staticPrivate;
	
	public static final int staticFinal = 1;
	public final int final1 = 2;

	
	public static int powerStatic(int x, int pow){
		return x*pow;
	}
	
	int power(int x, int pow){
		return (int)Math.round(Math.pow(x, pow));
	}
	
	
	
	public static void main(String[] args) {
		int x = 0;
		long l;
		float f;
		double d;
		
		boolean b;
		
		char c;
		byte bb;
		
		Integer x1 = (Integer)(Object)x;
		Object obj;
		
		String ss = new String("Hello");

		Main main = null;
		main.privat = 1;
		
		main.staticPrivate = 4;
		Main.staticPrivate = 5;
	}
	
}
