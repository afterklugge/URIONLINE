import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	static String typeOfNumber;
	static String typeOfNotation;

	public static void main(String[] args) throws Exception {

		while (sc.hasNext()) {
			typeOfNumber = args[1];
			typeOfNotation = args[0];
			String text = sc.nextLine();
			String[] input = text.split(" ");

			StackOfOperands stack = new StackOfOperands();

			for (int i = 0; i < input.length; i++) {
				if (input[i].equals("+") || input[i].equals("-") || input[i].equals("*") || input[i].equals("/")) {
					Number b = stack.pop();
					Number a = stack.pop();
					Number result;
					if (input[i].equals("+")) {
						result = a.add(b);
					} else if (input[i].equals("-")) {
						result = a.substract(b);
					} else if (input[i].equals("*")) {
						result = a.multiply(b);
					} else {
						result = a.divide(b);
					}
					stack.push(result);
				} else {
					if (typeOfNumber.equals("-real")) {
						stack.push(new RealNumber(input[i]));
					} else if (typeOfNumber.equals("-rational")) {
						stack.push(new RationalNumber(input[i]));
					} else if (typeOfNumber.equals("-complex")) {
						stack.push(new ComplexNumbers(input[i]));
					}
				}
			}
			System.out.println(stack.pop());
		}
	}
}