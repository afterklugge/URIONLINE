package Lab03;

public class MathUtils {
	public static int gcd(int a, int b) {
		if (a == 0 && b == 0) {
			throw new IllegalArgumentException("The gcd cannot equal to zero!");
		}
		while(b != 0) {
			int temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}
}