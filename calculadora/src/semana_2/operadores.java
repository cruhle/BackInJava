package semana_2;

import java.util.Scanner;

public class operadores {

	public static void main(String[] args) {
		new operadores();
	}
	
	public operadores() {
		super();
		Scanner sc = new Scanner(System.in);
		calcular_media_3_notas(sc);
		calcular_troco(sc);
	}

	private void calcular_media_3_notas(Scanner sc) {
		double total_notas = 0.0;
		for(int i=1;i<4;i++) {
			System.out.print(String.format("Introduza a %d nota: ",i));
			total_notas += sc.nextDouble();
		}
		System.out.println(String.format("Media das 3 notoas: %.2f", total_notas/3));
	}
	
	private void calcular_troco(Scanner sc) {
		
		System.out.print("Valor entregue: ");
		double valor_entregue = sc.nextDouble(); 
		
		System.out.print("Custo total: ");
		double valor_total = sc.nextDouble();
				
		System.out.println(String.format("Troco: %.2f", valor_entregue - valor_total));
	}
	
}
