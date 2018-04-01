package structuremode.composite;

public class Chassis extends CompositeEquipment {

	public Chassis(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		// TODO Auto-generated method stub
		return 1. + super.netPrice();
	}

	@Override
	public double discountPrice() {
		// TODO Auto-generated method stub
		return .5 + super.discountPrice();
	}
	
	
}
