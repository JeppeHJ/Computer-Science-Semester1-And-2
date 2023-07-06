package Materiale.rekursion;

public class EksemplerUndervisning1 {

    public static int fac(int n) {
        // Termineringsregel: Hvis n er 0, returneres 1
        if (n == 0) {
            return 1;
        } else {
            // Rekurrensregel: n-fakultet er n multipliceret med (n-1)-fakultet
            return n * fac(n - 1);
        }
    }

    public static int fib(int n) {
        // Termineringsregel: Hvis n er mindre eller lig med 1, returneres n
        if (n <= 1) {
            return n;
        } else {
            // Rekurrensregel: Fibonaccital for n er summen af fibonaccital for n-1 og n-2
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static int facItr(int n) {
        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        return result;
    }

    public static int fibItr(int n) {
        int result = 0;
        int f1 = 0;
        int f2 = 1;
        for (int i = 2; i <= n; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            System.out.println("Den rekursive fak " + i + "  er  " + fac(i));
            System.out.println("Den iterative fak " + i + "  er  " + facItr(i));
        }

        for (int i = 0; i <= 20; i++) {
            System.out.println("Den rekursive fib " + i + "  er  " + fib(i));
            System.out.println("Den iterative fib " + i + "  er  " + fibItr(i));
        }
    }

}
