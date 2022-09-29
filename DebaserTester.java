class DebaserTester { 
	public static void main(String[] args) {

		System.out.println("Debaser project: Alex Mazansky, Callia Liang, Niloy Basak (APCS pd. 2)\n");

		System.out.println("Constructing new debaser with default constructor");
		Debaser d1 = new Debaser();
		System.out.println("Getting stored value: " + d1.getValue() + " (expected: 0)");
		System.out.println("Setting stored value to 100");
		d1.setValue(100);
		System.out.println("Getting stored value: " + d1.getValue() + " (expected: 100)\n");

		System.out.println("Constructing new debaser with inital stored value 531000");
		Debaser d2 = new Debaser(531000);
		System.out.println("Getting stored value: " + d2.getValue() + " (expected: 531000)");
		System.out.println("Converting stored value from base 6 to base 10: " + d2.convertToBaseTen(6) + " (expected: 42984)");
		System.out.println("Converting stored value from base 10 to base 9: " + d2.convertToBaseN(9) + " (expected: 888350)\n");

		System.out.println("Constructing new debaser with initial stored value 300");
		Debaser d3 = new Debaser(300);
		System.out.println("Converting stored value from base 10 to base 9: " + d3.convertToBaseN(9) + " (expected: 363)\n");

		System.out.println("Constructing new debaser with initial stored value 123456");
		Debaser d4 = new Debaser(123456);
		System.out.println("Converting stored value from base 8 to base 10: " + d4.convertToBaseTen(8) + " (expected: 42798)\n");

		System.out.println("Constructing new debaser with initial stored value 9999");
		Debaser d5 = new Debaser(9999);
		System.out.println("Getting stored value: " + d5.getValue() + " (expected: 9999)");
		System.out.println("Converting stored value from base 10 to base 5: " + d5.convertToBaseN(5) + " (expected: 304444)\n");

		System.out.println("Constructing new debaser with initial stored value 16");
		Debaser d6 = new Debaser(16);
		System.out.println("Getting stored value: " + d6.getValue() + " (expected: 16)"); 
		System.out.println("Converting stored value from base 10 to base 2: " + d6.convertToBaseN(2) + " (expected: 10000)\n");

		System.out.println("Constructing new debaser with initial stored value 243");
		Debaser d7 = new Debaser(243);
		System.out.println("Getting stored value: " + d7.getValue() + " (expected: 243)");
		System.out.println("Converting stored value from base 10 to base 3: " + d7.convertToBaseN(3) + " (expected: 100000)\n");
		
		System.out.println("Constructing new debaser with initial stored value 4321");
		Debaser d8 = new Debaser(4321);
		System.out.println("Getting stored value: " + d8.getValue() + " (expected: 4321)");
		System.out.println("Converting stored value from base 10 to base 6: " + d8.convertToBaseN(6) + " (expected: 32001)\n");

		System.out.println("Constructing new debaser with initial stored value 5050");
		Debaser d9 = new Debaser(5050);
		System.out.println("Getting stored value: " + d9.getValue() + " (expected: 5050)");
		System.out.println("Converting stored value from base 10 to base 7: " + d9.convertToBaseN(7) + " (expected: 20503)\n");

		System.out.println("The grand finale...\nConstructing new debaser with default constructor");
		Debaser d10 = new Debaser();
		System.out.println("Getting stored value: " + d10.getValue() + " (expected: 0)");
		System.out.println("Converting stored value from base 10 to base 2: " + d10.convertToBaseN(2) + " (expected: 0)");
		System.out.println("Converting stored value from base 8 to base 10: " + d10.convertToBaseTen(8) + " (expected: 0)");
		System.out.println("Setting stored value to 731");
		d10.setValue(731);
		System.out.println("Getting stored value: " + d10.getValue() + " (expected: 731)");
		System.out.println("Converting stored value from base 10 to base 4: " + d10.convertToBaseN(4) + " (expected: 23123)");
		System.out.println("Converting stored value from base 9 to base 10: " + d10.convertToBaseTen(9) + " (expected: 595)");
	} 
}
