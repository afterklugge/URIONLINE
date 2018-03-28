package Lab04;

public class ArrayListInt {
	final int DEFAULT_CAPACITY = 10;
	private int[] data;
	private int size;

	public ArrayListInt() {
		data = new int[DEFAULT_CAPACITY];
		size = 0;
	}

	public void check(int index) {
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public void ensureCapacity() {
		if (data.length == size) {
			int[] temp = new int[data.length + 1];
			for (int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
		}
	}

	public int size() {
		return size;
	}

	public int get(int index) {
		check(index);
		return data[index];
	}

	public void set(int index, int value) {
		check(index);
		ensureCapacity();
		data[index] = value;
	}

	public void add(int value) {
		ensureCapacity();
		data[size++] = value;
	}

	public void add(int index, int value) {
		check(index);
		ensureCapacity();
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		data[index] = value;
		size++;
	}

	public void remove(int index) {
		check(index);
		for(int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		size--;
	}
}
