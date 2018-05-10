package Listing16_6;

import java.awt.*; //abstract windowing toolkit, enables java GUI
import java.awt.event.*;//enables us to respond to mouse and keyboard 'events', such as key presses
import javax.swing.*;//more awt and windowing
import javax.swing.border.TitledBorder;

import Listing10_01.Loan;

public class LoanCalculatorGui extends JFrame {
	// create text fields for interest rate, years, loan amount, monthly pmt and
	// total pmt
	private JTextField jtfAnnualInterestRate = new JTextField();// text fields that appear, their names
	private JTextField jtfNumberOfYears = new JTextField();
	private JTextField jtfLoanAmount = new JTextField();
	private JTextField jtfMonthlyPayment = new JTextField();// define the control here, then add to the panel, below
	private JTextField jtfTotalPayment = new JTextField();

	// create a compute payment button
	private JButton jbtComputeLoan = new JButton("Compute Payment"); // text appears on the button

	public LoanCalculatorGui() {
		// craft a panel to hold labels and text fields
		JPanel p1 = new JPanel(new GridLayout(5, 2));// dimensions specified

		p1.add(new JLabel("Annual Interest Rate"));
		p1.add(jtfAnnualInterestRate);

		p1.add(new JLabel("Number of Years"));
		p1.add(jtfNumberOfYears);

		p1.add(new JLabel("Loan Amount"));
		p1.add(jtfLoanAmount);

		p1.add(new JLabel("Monthly Payment"));
		p1.add(jtfMonthlyPayment);

		p1.add(new JLabel("Total Payment"));
		p1.add(jtfTotalPayment);

		p1.setBorder(new TitledBorder("Enter loan amount, interest rate, and years"));

		// create another panel, to hold the button
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtComputeLoan); // remember defining this in the private section, earlier?

		// add your panels to the frame
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);

		// register a listener, who will 'listen' to updates to the frame, and
		// interactions with it
		jbtComputeLoan.addActionListener(new ButtonListener());
	}// end constructor

	/**
	 * handle the compute payment button's events
	 */
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// get values from the text fields
			double interest = Double.parseDouble(jtfAnnualInterestRate.getText());

			int year = Integer.parseInt(jtfNumberOfYears.getText());

			double loanAmount = Double.parseDouble(jtfLoanAmount.getText());

			Loan loan = new Loan(interest, year, loanAmount);// see page 376 for source for loan object

			// display the monthly total payment and monthly payment
			jtfMonthlyPayment.setText(String.format("%.2f", loan.getMonthlyPayment()));

			jtfTotalPayment.setText(String.format("%.2f", loan.getTotalPayment()));
		}// end action performed
	}

	public static void main(String[] args) {
		LoanCalculatorGui frame = new LoanCalculatorGui();
		frame.pack();

		frame.setTitle("Loan Calculator");

		frame.setLocationRelativeTo(null); // forces the new window to appear in the center

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// what happens when you touch the X in the above left
																// corner

		frame.setVisible(true);// so it appears
	}

}// end lc
