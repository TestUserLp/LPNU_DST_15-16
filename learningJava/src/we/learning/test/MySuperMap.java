package we.learning.test;

import java.util.HashMap;

public class MySuperMap implements IMap {

	private final HashMap<Main, Object> hiddenMap = new HashMap<>();

	@Override
	public void add(Main key, Object value) {
		this.hiddenMap.put(key, value);

	}

	@Override
	public Object get(Main key) {
		return this.hiddenMap.get(key);
	}

}
