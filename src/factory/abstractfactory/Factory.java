package factory.abstractfactory;

import factory.Simple;

public abstract class Factory {
	
	public abstract Simple creator();
	
	public abstract Simple2 creator(String name);
}
