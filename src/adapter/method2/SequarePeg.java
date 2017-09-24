package adapter.method2;

public class SequarePeg implements ISquarePeg {

	@Override
	public void insert(String msg) {
		
		System.out.print("SequarePeg insert():" + msg);
	}

}
