import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int res, i;
   
        i = 1;
        
        while (i <= 10) {
            res = 5 * i;
            System.out.printf("\n5 X %d = %d", i, res);
           
            if (i == 10)
                break;
           
            i++;
        }
    }
}
