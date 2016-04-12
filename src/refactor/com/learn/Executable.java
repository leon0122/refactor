package refactor.com.learn;

import java.util.Map;

@FunctionalInterface
interface Executable<T> {
	public T execute(Map map) throws Exception;
}
