package Lab03;

import java.util.*;

public class Lab03Example01 {
	static Scanner sc = new Scanner(System.in);
	static String NAME = "Calculator of Rational Numbers";

	public static void main(String[] args) {
		System.out.println(NAME);

		Rational op1 = readRational("Enter 1st rational:");
		String op = readOperator("Enter operator: ");
		Rational op2 = readRational("Enter 2nd rational: ");
		Rational result = null;
		int compare;
		switch (op) {
		case "+":
			result = op1.add(op2);
			break;
		case "-":
			result = op1.substract(op2);
			break;
		case "*":
			result = op1.multiply(op2);
			break;
		case "/":
			result = op1.divide(op2);
			break;
//		case "compare":
//			compare = op1.compareTo(op2);
//			System.out.println(compare);
//			break;
		}
		System.out.println(op1 + " " + op + " " + op2 + " " + "=" + " " + result);
		
	}

	static String readOperator(String msg) {
		while (true) {
			System.out.println(msg);

			if (!sc.hasNextLine()) {
				return null;
			}
			String line = sc.nextLine();
			if (line.length() == 1 && "+-*/".contains(line)) {
				return line;
			}
//			if ("compare".contains(line)) {
//				return line;
//			}
			System.out.println("Incorrect line " + line);
		}
	}

	static Rational readRational(String msg) {
		while (true) {
			System.out.print(msg);

			if (!sc.hasNextLine())
				return null;

			String line = sc.nextLine();

			try {
				return Rational.parse(line);
			} catch (NumberFormatException e) {
				System.out.println("Incorrect rational: " + line);

			} catch (RuntimeException e) {
				System.out.println("Denominator cannot be zero");
			}
		}
	}
}
