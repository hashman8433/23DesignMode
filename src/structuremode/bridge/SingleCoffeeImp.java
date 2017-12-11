package structuremode.bridge;

public class SingleCoffeeImp {
	
	private static CoffeeImp coffeeImp;
	
	public SingleCoffeeImp(CoffeeImp coffeeImp){
		this.coffeeImp = coffeeImp ; 
	}

	public static CoffeeImp getCoffeeImp() {
		return coffeeImp;
	}

	public static void setCoffeeImp(CoffeeImp coffeeImp) {
		SingleCoffeeImp.coffeeImp = coffeeImp;
	}

	
}
