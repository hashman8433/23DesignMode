package structuremode.flyweightfactory;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	
	private Map<String,Flyweight> flyWeigthMap = new HashMap<String,Flyweight>();
	
	public Flyweight getFlyweight(String key){
		Flyweight flyWeight = (Flyweight)flyWeigthMap.get(key);
		if(flyWeight == null){
			flyWeight = new ConcreteFlyWeigth();
			flyWeigthMap.put(key, flyWeight);
		}
		
		return flyWeight;
	}
	
	public static void main(String[] args) {
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		Flyweight fly1 = flyweightFactory.getFlyweight( "Fred" );
		Flyweight fly2 = flyweightFactory.getFlyweight( "wilma" );
	}
}
