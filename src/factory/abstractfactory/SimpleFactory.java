package factory.abstractfactory;

import createmode.factory.Simple;
import createmode.factory.SimpleA;

public class SimpleFactory extends Factory {

	@Override
	public Simple creator() {
		// TODO Auto-generated method stub
		return new SimpleA();
	}

	@Override
	public Simple2 creator(String name) {
		// TODO Auto-generated method stub
		return new Simple2A();
	}

}
