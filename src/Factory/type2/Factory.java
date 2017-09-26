package Factory.type2;

import Factory.Simple;

public abstract class Factory {
	
	public abstract Simple creator();
	
	public abstract Simple2 creator(String name);
}
