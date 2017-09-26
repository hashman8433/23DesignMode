package Factory;

public class Factory {

	public static Simple creator(int whitch){
		if(whitch == 1)
			return new SimpleA();
		else 
			return new SimpleB();
	}
	
	public static void main(String[] args){
		Simple sample = Factory.creator(1);
	}
}
