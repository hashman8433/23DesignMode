package factory.abstractfactory;

import createmode.factory.Simple;
import createmode.factory.SimpleB;

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
