package calc;

/**
 * Basic Tester class that creates a Calculator object and runs the main method.
 * @author Alejandro
 *
 */
public class CalcTester {

	/**
	 * Main method of the program.
	 * @param args (Not used) command line arguments.
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
//		calc.run();
		Calculator sCalc = new SciCalculator();
		sCalc.run();
	}
}
