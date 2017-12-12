
public class Lab04Example01 {

	public static void main(String[] args) {
		double s = 0.0;
		
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		s += 0.1;
		
		// if (s == 1.0) {
		if (Math.abs(s - 1) < 0.000001) {
			System.out.println("OK");
		} else {
			System.out.println("???: " + s);
		}
	}

}
