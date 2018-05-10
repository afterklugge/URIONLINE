package Listing10_01;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Enter yearly interest rate
		System.out.print("Enter yearly interest rate, for example, 8.25: ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		System.out.print("Enter loan amount, for example, 120000.95: ");
		double loanAmount = input.nextDouble();

		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

		System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
	}

}
