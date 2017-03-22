package we.learning.test;

import we.learning.java.Test;

public class Main {
	private static int nextId = 0;

	public final int id = Main.nextId++;

	private int data;

	public Main(int data) {
		this.data = data;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(new Main(i));
		}

		Main m1 = new Main(1);
		Main m2 = new Main(1);
		System.out.println(m1.equals(m2));

		IMap map = new MySuperMap();//new MyHashMap();

		Main key = new Main(3);

		map.add(new Main(1), 1);
		map.add(new Main(2), 2);
		map.add(key, 3);
		map.add(new Main(4), 4);

		System.out.println(map.get(key));
		System.out.println(map.get(new Main(1)));
		System.out.println(map.get(new Main(33)));
		
		System.out.println("Finito.");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + data;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Main other = (Main) obj;
		if (data != other.data)
			return false;
		return true;
	}

	// @Override
	// public boolean equals(Object that) {
	// if(that == null || !(that instanceof Main))
	// return false;
	//
	// return equals((Main)that);
	// }
	//
	// public boolean equals(Main that){
	//
	// if(that == null)
	// return false;
	//
	// return this.data == that.data;
	// }
	//
	@Override
	public String toString() {
		return "Main: " + this.id;
	}
}
