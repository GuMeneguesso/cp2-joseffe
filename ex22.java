import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numA, numB;
	       
        System.out.printf("Digite um n�mero: ");
        numA = ler.nextDouble();
        
        System.out.printf("Digite um n�mero maior que o n�mero anterior: ");
        numB = ler.nextDouble();
       
        while(numB <= numA) {
            System.out.printf("Digite um n�mero MAIOR que o n�mero anterior: ");
            numB = ler.nextInt();
        }
	}
}