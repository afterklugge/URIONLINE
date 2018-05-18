
public abstract class Number {
	String data = "";

	public Number() {
		data = "0";
	}

	public void Number(String number) {
		data = number;
	}

	abstract Number add(Number other) throws Exception;

	abstract Number substract(Number other) throws Exception;

	abstract Number multiply(Number other) throws Exception;

	abstract Number divide(Number other) throws Exception;

	public String toString() {
		return data;

	}

}
