
public class ex30 {

	public static void main(String[] args) {
		int numA = 1;
		int numB = 1;
		int numC = 1;
		int i = 1;
		
		for (i = 1; i <= 20; i++) {
			System.out.printf("\n%d", numA);
			int numD = numA + numB + numC;
			numA = numB;
			numB = numC;
			numC = numD;
		}
		
	}

}
