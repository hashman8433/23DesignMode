package flyweightfactory;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	
	private Map<String,FlyWeight> flyWeigthMap = new HashMap<String,FlyWeight>();
	
	public FlyWeight getFlyWeight(String key){
		FlyWeight flyWeight = (FlyWeight)flyWeigthMap.get(key);
		if(flyWeight == null){
			flyWeight = new ConcreteFlyWeigth();
			flyWeigthMap.put(key, flyWeight);
		}
		
		return flyWeight;
	}
	
	public static void main(String[] args) {
		FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
		flyWeightFactory.getFlyWeight("hello");
		flyWeightFactory.getFlyWeight("wangshihua");
		
		
	}
}
