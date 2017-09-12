package bridge;

public class PourMain {
	public static void main(String[] args) {
		
		SingleCoffeeImp singleCoffeeImp = 
				new SingleCoffeeImp(new MilkCoffeeImp());
		
		MediumCoffee mediumCoffee = 
				new MediumCoffee();
		mediumCoffee.pourCoffee();
		
	}
}
