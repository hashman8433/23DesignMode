package structuremode.composite;

import java.util.Iterator;

public abstract class Equipment {
	private String name;
	
	// 实价
	public abstract double netPrice();
	
	// 折扣介个
	public abstract double discountPrice();
	
	// 增加部件方法
	public boolean add(Equipment equipment) {
		return false;
	}
	
	// 删除部件方法
	public boolean remove(Equipment equipment) {
		return false;
	}
	
	public Iterator iter() { return null;}
	
	public Equipment(final String name) {
		this.name = name;
	}
}
