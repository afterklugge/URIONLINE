import java.math.BigInteger;

public class RationalNumber extends Number {
	BigInteger num;
	BigInteger den;

	public RationalNumber(BigInteger aNum, BigInteger aDen) throws Exception {
		num = aNum;
		den = aDen;

		if (den.equals(0)) {
			throw new Exception("Denominator cannot be zero!");
		}
	}

	public RationalNumber(String line) throws Exception {
		int slash = line.indexOf("/");
		String sNum = line.substring(1, slash);
		String sDen = line.substring(slash + 1, line.length() - 1);

		num = new BigInteger(sNum);
		den = new BigInteger(sDen);

		if (den.equals(0)) {
			throw new Exception("Denominator cannot be zero!");
		}
	}

	@Override
	Number add(Number other) throws Exception {
		RationalNumber b = (RationalNumber) other;
		return new RationalNumber(num.multiply(b.den).add(den.multiply(b.num)), den.multiply(b.den));
	}

	@Override
	Number substract(Number other) throws Exception {
		RationalNumber b = (RationalNumber) other;
		return new RationalNumber(num.multiply(b.den).subtract(den.multiply(b.num)), den.multiply(b.den));
	}

	@Override
	public String toString() {
		return "[" + num + "/" + den + "]";
	}

	@Override
	Number multiply(Number other) throws Exception {
		RationalNumber b = (RationalNumber) other;
		return new RationalNumber(num.multiply(b.num), den.multiply(b.den));
	}

	@Override
	Number divide(Number other) throws Exception {
		RationalNumber b = (RationalNumber) other;
		return new RationalNumber(num.multiply(b.den), den.multiply(b.num));
	}

}
