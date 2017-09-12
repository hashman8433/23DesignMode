package bridge;

public class MediumCoffee extends Coffee {

	public MediumCoffee() {
		setCoffeeImp();
	}

	@Override
	public void pourCoffee() {
		
		CoffeeImp coffeeImp = getCoffeeImp();
		
		for(int i=0;i<5;i++)
			coffeeImp.pourCoffee();
	}
	
	
	
}
