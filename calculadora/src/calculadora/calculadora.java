package calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] argvs) {
		new calculadora();
	}
	
	public calculadora() {
		Scanner sc = new Scanner(System.in);
		
		double nr1 = pedeNumero(sc, "1 Numero: ");
		double nr2 = pedeNumero(sc, "2 Numero: ");
		
		System.out.println(String.format("Numero %.2f + %.2f = %.2f", nr1, nr2, (nr1+nr2)));
		
	}
	
	private double pedeNumero(Scanner sc, String msg) {
		System.out.print(msg);
		return sc.nextDouble();		
	}
	
}
