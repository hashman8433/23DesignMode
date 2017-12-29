package structuremode.decorator;

/**
 * ClassName:SquarePeg.java
 * Reason:	 TODO ADD REASON
 *
 * @author   zhaozj
 * @since    Ver 1.1
 * @Date	 2017年12月29日
 */
public class SquarePeg implements Work {

	/* (non-Javadoc)
	 * @see structuremode.decorator.Work#insert()
	 */
	@Override
	public void insert() {
		System.out.println("方形桩插入");
	}

}
