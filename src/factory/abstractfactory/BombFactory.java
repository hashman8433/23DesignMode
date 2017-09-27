package factory.abstractfactory;

import factory.Simple;
import factory.SimpleB;

public class BombFactory extends Factory {

	@Override
	public Simple creator() {
		// TODO Auto-generated method stub
		return new SimpleB();
	}

	@Override
	public Simple2 creator(String name) {
		// TODO Auto-generated method stub
		return new Simple2B();
	}

}
