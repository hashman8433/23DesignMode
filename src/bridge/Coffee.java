package bridge;

public abstract class Coffee {
	
	private CoffeeImp coffeeImp ;
	
	public void setCoffeeImp(){
		coffeeImp = SingleCoffeeImp.getCoffeeImp();
	}
	
	public CoffeeImp getCoffeeImp(){
		return coffeeImp;
	}
	
	public abstract void pourCoffee();
}
