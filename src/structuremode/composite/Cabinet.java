package structuremode.composite;

public class Cabinet extends CompositeEquipment {

	public Cabinet(String name) {
		super(name);
	}

	@Override
	public double netPrice() {
		return 1. + super.netPrice();
	}

	@Override
	public double discountPrice() {
		return 0.5 + super.discountPrice();
	}
	
	public static void main(String[] args) {
		Cabinet cabinet = new Cabinet("Tower");
		Chassis chassis=new Chassis("PC Chassis");
		Disk disk = new Disk("Disk");
		cabinet.add(chassis);
		chassis.add(disk);
		
		System.out.println("netPrice ==> " + cabinet.netPrice());
		System.out.println("discountPrice ==> " + cabinet.discountPrice());
	}
}
