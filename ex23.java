import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		char sexo;
		
		System.out.printf("Qual o seu g�nero? (F/M): ");
		sexo = ler.next().charAt(0);

		while ((sexo != 'f') && (sexo != 'm')){
			System.out.printf("ERRO!!!! Qual o seu g�nero? (F para Feminino e M para Masculino): ");
			sexo = ler.next().charAt(0);
		}
	}

}
