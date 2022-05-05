
public class ex29 {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c;
		
		for (int i=0; i<29; i++) {
			System.out.println(a);
			c = a;
			a = a + b;
			b = c;
		}
	}
}
