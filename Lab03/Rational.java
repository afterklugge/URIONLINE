package Lab03;

public class Rational {
	private int num;
	private int den;

	public void fixSign() {
		if (den < 0) {
			den = -den;
			num = -num;
		}
	}

	public Rational(int aNum, int aDen) {
		if (aDen == 0) {
			throw new RuntimeException("The denominator cannot be zero!");
		}
		num = aNum;
		den = aDen;
		int d = MathUtils.gcd(num, den);

		num /= d;
		den /= d;
		fixSign();
	}

	public Rational add(Rational other) {
		return new Rational(num * other.den + den * other.num, den * other.den);
	}

	public Rational substract(Rational other) {
		return new Rational(num * other.den - den * other.num, den * other.den);
	}

	public Rational multiply(Rational other) {
		return new Rational(num * other.num, den * other.den);
	}

	public Rational divide(Rational other) {
		return new Rational(num * other.den, den * other.num);
	}

//	int compareTo(Rational other) {
//		double a = (double) (num / den);
//		double b = (double) (other.num / other.den);
//		if (a < b)
//			return -1;
//		else if (a > b)
//			return 1;
//		else
//			return 0;
//	}

	@Override
	public String toString() {
		return num + "/" + den;
	}

	public static Rational parse(String line) {
		int slashIndex = line.indexOf("/");
		if (slashIndex == -1) {
			int n = Integer.parseInt(line);
			return new Rational(n, 1);
		}
		String strN = line.substring(0, slashIndex);
		String strD = line.substring(slashIndex + 1);

		int n = Integer.parseInt(strN);
		int d = Integer.parseInt(strD);
		return new Rational(n, d);

	}
}
