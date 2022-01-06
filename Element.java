public class Element<T> {
	
	private T value;
	private int key;
	
	public Element(T value, int key) {
		this.value = value;
		this.key = key;
	}
	
	public T getValue() {
		return value;
	}
	
	public int getKey() {
		return key;
	}
	
	public boolean equals(Element<T> other) {
		return this.key == other.getKey() && this.value == other.getValue();
	}
	
}
