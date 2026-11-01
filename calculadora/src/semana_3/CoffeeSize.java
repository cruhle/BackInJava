package semana_3;

public enum CoffeeSize {
	
	 SMALL("Small", 1.00),
	 MEDIUM("Medium", 1.50),
	 LARGE("Large", 2.00); // ; ends the list
	
	 private final String label;
	 private final double price;
	 
	 CoffeeSize(String label, double price) {
		 this.label = label; // always private
		 this.price = price;
	 }
	 
	 public String getLabel() { return label; }

	 public double getPrice() { return price; }
	 
}
