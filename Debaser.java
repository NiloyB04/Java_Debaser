/**
 * A debaser converts numbers from base 10 to other bases and from other bases to base 10.
 * Division of labor: Alex wrote the convertToBaseTen method and some test cases. Callia wrote the convertToBaseN method and some test cases. Niloy wrote the constructors, javadoc, and most of the test cases/tester class.
 */
public class Debaser {
	private int stored;

	/**
	 * Constructs a debaser and sets the stored value to 0
	 */
	public Debaser() {
		stored = 0;
	}

	/**
	 * Constructs a debaser with a user-specified stored value
	 * @param value the value to initially store in the debaser
	 */
	public Debaser(int value) {
		stored = value;
	}

	/**
	 * Sets stored value to inputted value
	 * @param value the value to store in the debaser
	 */
	public void setValue(int value) {
		stored = value;
	}

	/**
	 * Gets the value currently stored in the debaser
	 * @return stored value
	 */
	public int getValue() {
		return stored;
	}

	/**
	 * Converts the inputted number from base 10 to another base
	 * @param n the base we want to change into
	 * @return number resulting from the conversion
	 */ 
	public int convertToBaseN(int n) {
		int digit = stored % n;
		int number = stored / n;
		int digit1 = number % n;
		int number1 = number / n;
		int digit2 = number1 % n;
		int number2 = number1 / n;
		int digit3 = number2 % n;
		int number3 = number2 / n;
		int digit4 = number3 % n;
		int number4 = number3 / n;
		int convertedNumber = (number4 * 100000) + (digit4 * 10000) + (digit3 * 1000) + (digit2 * 100) + (digit1 * 10) + (digit * 1);
		return convertedNumber;
	}

	/**
	 * Converts the inputted number from another base to base 10
	 * @param n the base of the stored value
	 * @return number resulting from the conversion
	 */
	public int convertToBaseTen(int n) {
		int sum = 0;
		
		int digit = stored / 100000; // first digit base n
		sum += digit * Math.pow(n, 5); // convert to base 10 and add to the running total 

		digit = (stored / 10000) % 10; // second digit base n
		sum += digit * Math.pow(n, 4);

		digit = (stored / 1000) % 10; // etc.
		sum += digit * Math.pow(n, 3);

		digit = (stored / 100) % 10;
		sum += digit * n * n;

		digit = (stored / 10) % 10;
		sum += digit * n;

		digit = stored % 10; // last digit base n
		sum += digit;
		
		return sum;
	}
}
