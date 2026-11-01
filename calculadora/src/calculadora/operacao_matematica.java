package calculadora;

import java.util.Scanner;

public class operacao_matematica {

	public static void main(String[] args) {
		new operacao_matematica();
	}
	
	public operacao_matematica() {
		Scanner sc = new Scanner(System.in);
		
		double nr1 = pedeNumero(sc, "1 Numero: ");
		double nr2 = pedeNumero(sc, "2 Numero: ");		
		String oper = pedeOperacao(sc);
		double resultado = calculaResultado(oper.charAt(0), nr1, nr2);
		
		System.out.println(String.format("Numero %.2f %s %.2f = %.2f", nr1, oper, nr2, resultado));
	}

	private double pedeNumero(Scanner sc, String msg) {
		System.out.print(msg);
		return sc.nextDouble();		
	}
 	
	private String pedeOperacao(Scanner sc) {
		System.out.println("Operacao: + - / * ?");
		char op = sc.next().charAt(0);
		
		switch(op) {
		case '+':
			return "+";
		case '-':
			return "-";
		case '*':
			return "*";
		case '/':
			return "/";
		default:
			return "+";
		}
	}
	
	private double calculaResultado(char op, double nr1, double nr2) {
		switch(op) {
		case '+':
			return nr1 + nr2;
		case '-':
			return nr1 - nr2;
		case '*':
			return nr1 * nr2;
		case '/':
			return nr1 / nr2;
		default:
			return 0;
		}
		
	}
}
