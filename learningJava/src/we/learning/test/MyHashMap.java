package we.learning.test;

import java.util.Arrays;

public class MyHashMap implements IMap {
	private static final int SIZE = 100;

	private KeyValue[][] elements = new KeyValue[SIZE][];

	public MyHashMap() {

	}

	public void add(Main key, Object value) {
		// check for null;

		int hash = key.hashCode();

		KeyValue[] row = this.elements[hash % SIZE];

		if (row == null)
			row = new KeyValue[1];
		else
			row = Arrays.copyOf(row, row.length + 1);

		row[row.length - 1] = new KeyValue(key, value);

		this.elements[hash % SIZE] = row;
	}

	public Object get(Main key) {
		// check for null

		int hash = key.hashCode();

		KeyValue[] row = this.elements[hash % SIZE];
		if (row != null) {
			return findElement(row, key);
		}

		return null;
	}

	private Object findElement(KeyValue[] row, Main key) {
		for (KeyValue element : row) {
			if (element.key.equals(key))
				return element.value;
		}
		return null;
	}

	private static class KeyValue {
		public final Main key;
		public final Object value;

		public KeyValue(Main key, Object value) {
			this.key = key;
			this.value = value;
		}
	}
}
