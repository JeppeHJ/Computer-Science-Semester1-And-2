package Materiale.eksempel;

public class EksempelRekursiveMetoder {

	public static int arealTrekant(int bredde) {
		// Termineringsregel: Hvis bredden er 1, returneres 1
		if (bredde == 1) {
			return 1;
		} else {
			// Rekurrensregel: Arealet af trekanten er summen af bredden og arealet af en trekant med en mindre bredde
			return bredde + arealTrekant(bredde - 1);
		}
	}

	public static int fib(int n) {
		// Termineringsregel: Hvis n er mindre eller lig med 1, returneres n
		if (n <= 1) {
			return n;
		} else {
			// Rekurrensregel: Fibonacci-tallet er summen af de to foregående Fibonacci-tal
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int g(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return 5;
		} else {
			return 5 * g(n - 1) - 6 * g(n - 2);
		}
	}

	// Hvad udskrives ved kaldet ex0(6)
	public static void ex0(int n) {
		if (n > 0) {
			System.out.println(n);
			ex0(n - 2);
			System.out.println(n);
		}
	}

	// Hvad udskrives ved kaldet ex1(6)
	public static void ex1(int n) {
		if (n > 0) {
			System.out.println(n);
			ex1(n - 2);
			ex1(n - 3);
			System.out.println(n);
		}
	}

	// Hvad udskrives ved kaldet ex2(6)
	public static String ex2(int n) {
		if (n > 0) {
			// Rekurrensregel: Resultatet er sammensat af n, rekursivt kald med n-2 og n
			return n + ex2(n - 2) + n;
		} else {
			return "";
		}
	}

	// Hvad udskrives ved kaldet ex3(6)
	public static String ex3(int n) {
		// Rekurrensregel: Resultatet er sammensat af n, rekursivt kald med n-2 og n
		String result = n + ex3(n - 2) + n;
		if (n <= 0) {
			result = "";
		}
		return result;
	}

	public static void main(String[] args) {

		System.out.println("TrekantAreal(4): " + arealTrekant(4));

		// System.out.println("fib(7): " + fib(7));

		// System.out.println("g(4): " + g(4));

		// System.out.println("Kald til ex0(6)");
		// ex1(6);
		// System.out.println();

		// System.out.println("Kald til ex2(6)");
		// System.out.println(ex2(6));
		// System.out.println();

		// System.out.println("Kald til ex3(6)");
		// System.out.println(ex3(6));
		// System.out.println();

	}

}
