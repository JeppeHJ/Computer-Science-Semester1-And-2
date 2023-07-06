package Materiale.eksempel;

public class Triangle {

	public static int areal(int bredde) {
		// Termineringsregel: Hvis bredden er 1, returneres 1
		if (bredde == 1) {
			return 1;
		} else {
			// Rekurrensregel: Arealet af trekanten er summen af bredden og arealet af en trekant med en mindre bredde
			return bredde + areal(bredde - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(areal(4));
	}

}
