package calculadora;

import java.util.Scanner;

public class quatroDesafios {

	public static void main(String[] args) {
		new quatroDesafios();
	}
	
	public quatroDesafios() {
		super();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(par_impar(sc));
		System.out.println(resultado_exame(sc));
		System.out.println(classificar_idade(sc));		
		System.out.println(maior_3_numeros(sc));
		
	}
	
	private String par_impar(Scanner sc) {
		System.out.print("Escreva um numero 1-10:");
		int nr = (sc.nextInt()%2);
		return (nr==0)?"Par":"Impar";
	}

	private String resultado_exame(Scanner sc) {
		System.out.print("Qual o resultado do exame (0-20):");
		boolean nr = (sc.nextInt()>9);
		return (nr)?"Passou":"Chumbou";
	}
	
	private String classificar_idade(Scanner sc) {
		System.out.print("Qual a sua idade:");
		int idade = sc.nextInt();
		
		if(idade>69) {
			return String.format("Idoso: %d",idade).toString();
		}else if(idade>17) {
			return String.format("Adulto: %d",idade).toString();
		}else if(idade>12) {
			return String.format("Adolescente: %d",idade).toString();
		}else {
			return String.format("Crianca: %d",idade).toString();
		}
		
	}
	
	private String maior_3_numeros(Scanner sc) {
		
		int nr1 = 0;
		int bigNR = 0;
		for(int i=1;i<4;i++) {
			System.out.print(String.format("Introduza o %d numero: ",i));
			nr1 = sc.nextInt();
			bigNR = ((nr1>bigNR) ? nr1:bigNR);
		}
		
		return String.format("O maior numero introduzido foi %d.", bigNR);
	}
		
}
