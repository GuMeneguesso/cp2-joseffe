import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		int i = 0;
		int imp = 3;
		int num = 2;
		
		System.out.printf("Digite o valor positivo de N: ");
		n = ler.nextInt();
		while (n < 0 || n > 100) {
			System.out.printf("Erro! O valor de N deve ser positivo e menor que 100. \nDigite outro valor: ");
			n = ler.nextInt();
		}
	while (i < n) {
		System.out.println(num);
		num = num + imp;
		imp = imp + 2;
		i++;
	}
	
	}
}
