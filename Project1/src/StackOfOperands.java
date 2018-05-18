import java.util.ArrayList;

public class StackOfOperands {

	private ArrayList<Number> data = new ArrayList<>();

	public void push(Number e) {
		data.add(e);
	}

	public int size() {
		return data.size();
	}

	public Number pop() {
		if (data.isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}

		Number r = data.get(data.size() - 1);
		data.remove(data.size() - 1);
		return r;
	}

}