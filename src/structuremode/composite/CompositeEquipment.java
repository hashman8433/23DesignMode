package structuremode.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public abstract class CompositeEquipment extends Equipment {

	private int i = 0;
	
	private List equipments = new ArrayList();
	
	public CompositeEquipment(String name) { super(name); }

	public boolean add(Equipment equipment) {
		equipments.add(equipment);
		return true;
	}
	
	@Override
	public double netPrice() {
		double netPrice = 0;
		
		Iterator iter = equipments.iterator();
		
		while (iter.hasNext()) {
			netPrice += ((Equipment)iter.next()).netPrice();
		}
		return netPrice;
	}

	@Override
	public double discountPrice() {
		
		double discountPrice = 0;
		
		Iterator iter = equipments.iterator();
		
		while (iter.hasNext()) {
			discountPrice += ((Equipment)iter.next()).discountPrice();
		}
		return discountPrice;
	}
	
	public Iterator iter () {
		return equipments.iterator();
	}
	
	public boolean hasNext() {
		return i < equipments.size();
	}
	
	public Object next() {
		if (hasNext()) {
			return equipments.get(i++);
		} else {
			throw new NoSuchElementException();
		}
	}

}
