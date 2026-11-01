package semana_3;


public class Main {
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		super();
		
		CoffeeSize size = CoffeeSize.LARGE;
		//System.out.println(size.getLabel() + " costs " + size.getPrice());
		System.out.printf("%-5s costs %.2f EUR%n", size.getLabel(), size.getPrice());
		// Large costs 2.0
		
		for (CoffeeSize s : CoffeeSize.values()) {
			System.out.printf("%-11s %.2f EUR%n", s.getLabel(), s.getPrice());
		}

	}

}