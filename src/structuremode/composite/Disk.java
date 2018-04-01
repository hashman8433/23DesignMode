package structuremode.composite;

public class Disk extends Equipment {

	public Disk(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return 3.;
	}

	@Override
	public double discountPrice() {
		return .8;
	}

}
