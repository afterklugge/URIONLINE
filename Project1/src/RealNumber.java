
public class RealNumber extends Number {
	private double n;

	public RealNumber(String number) {
		super();
		n = Double.parseDouble(number);
		super.data = number;
	}

	@Override
	Number add(Number other) {
		RealNumber b = (RealNumber) other;
		double result = n + b.n;
		return new RealNumber(Double.toString(result));
	}

	@Override
	Number substract(Number other) {
		RealNumber b = (RealNumber) other;
		double result = n - b.n;
		return new RealNumber(Double.toString(result));

	}

	@Override
	Number multiply(Number other) {
		RealNumber b = (RealNumber) other;
		double result = n * b.n;
		return new RealNumber(Double.toString(result));

	}

	@Override
	Number divide(Number other) {
		RealNumber b = (RealNumber) other;
		double result = n / b.n;
		return new RealNumber(Double.toString(result));

	}

}
