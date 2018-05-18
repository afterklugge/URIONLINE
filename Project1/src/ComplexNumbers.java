//// DOESNT WORK SUKA
public class ComplexNumbers extends Number {
	private int natural;
	private int imagine;

	public ComplexNumbers(int nat, int img) {
		natural = nat;
		imagine = img;
	}

	public ComplexNumbers(String line) {
		super();
		parse(line);

		super.data = line;
	}

	public ComplexNumbers parse(String line) {
		int nat = Integer.parseInt(line.substring(line.indexOf('[') + 1, line.indexOf(',')));
		int img = Integer.parseInt(line.substring(line.indexOf(',') + 1, line.indexOf('i')));

		return new ComplexNumbers(nat, img);

	}

	@Override
	Number add(Number other) throws Exception {
		ComplexNumbers b = (ComplexNumbers) other;
		return new ComplexNumbers(natural + b.natural, imagine + b.imagine);
	}

	@Override
	Number substract(Number other) throws Exception {
		ComplexNumbers b = (ComplexNumbers) other;
		return new ComplexNumbers(natural - b.natural, imagine - b.imagine);

	}

	@Override
	Number multiply(Number other) throws Exception {
		ComplexNumbers b = (ComplexNumbers) other;
		return new ComplexNumbers(natural * b.natural, imagine * b.imagine);

	}

	@Override
	Number divide(Number other) throws Exception {
		ComplexNumbers b = (ComplexNumbers) other;
		return new ComplexNumbers(natural / b.natural, imagine / b.imagine);

	}

}
