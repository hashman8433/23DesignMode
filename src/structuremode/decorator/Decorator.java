package structuremode.decorator;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * ClassName:Decorator.java
 * Reason:	 TODO ADD REASON
 *
 * @author   zhaozj
 * @since    Ver 1.1
 * @Date	 2017年12月29日
 */
public class Decorator implements Work {

	private Work work;
	
	private ArrayList others = new ArrayList();
	
	public Decorator(Work work) {
		this.work = work;
		
		others.add("挖坑");
		
		others.add("钉木板");
	}

	/* (non-Javadoc)
	 * @see structuremode.decorator.Work#insert()
	 */
	@Override
	public void insert() {
		// TODO Auto-generated method stub
		newMethod();
	}

	
	public void newMethod() {
		// TODO Auto-generated method stub
		otherMethod();
		work.insert();
	}

	
	public void otherMethod() {
		ListIterator listIterator = others.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next() + " 正在进行");
		}
	}
	
	public static void main(String[] args) {
		SquarePeg squarePeg = new SquarePeg();
		Decorator decorator = new Decorator(squarePeg);
		decorator.insert();
	}

}
