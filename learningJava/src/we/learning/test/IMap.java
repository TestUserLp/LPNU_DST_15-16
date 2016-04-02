package we.learning.test;

public interface IMap {

	/**
	 * Tst
	 * @param key
	 * @param value
	 */
	public void add(Main key, Object value);

	/**
	 * @param key
	 * @return
	 */
	public Object get(Main key);
}