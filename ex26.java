import java.util.Scanner;

public class ex26 {

	 public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	       
	        int numA, numB, t, i;
	        
	        System.out.printf("Digite um n�mero positivo: ");
	        numA = ler.nextInt();
	        
	        System.out.printf("Digite um n�mero positivo para determinar o intervalo: ");
	        numB = ler.nextInt();
	       
	        while(numA <= 0) {
	            System.out.printf("Erro, n�mero negativo! Digite um n�mero positivo: ");
	            numA = ler.nextInt();
	        }
	       
	        i = 1;
            
	        while (i <= 10) {
	            t = numA * i;
	            System.out.printf("\n%d X %d = %d", numA, i, t);
	           
	            if (i == numB)
	                break;
	           
	            i++;
	           
	            
	        }
	    }
	}

