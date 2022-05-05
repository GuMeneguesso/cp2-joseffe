import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numA, numB;
	       
        System.out.printf("Digite um número: ");
        numA = ler.nextDouble();
        
        System.out.printf("Digite um número maior que o número anterior: ");
        numB = ler.nextDouble();
       
        while(numB <= numA) {
            System.out.printf("Digite um número MAIOR que o número anterior: ");
            numB = ler.nextInt();
        }
	}
}