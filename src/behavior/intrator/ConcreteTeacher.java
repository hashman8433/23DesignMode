package behavior.intrator;

import java.security.PermissionCollection;

public class ConcreteTeacher implements Teacher {

	private Object[] precent = {"张三来了", "李四来了", "王五没来"};
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}
	
	@Override
	public int getSize() {
		return precent.length;
	}

	@Override
	public Object getElement(int index) {
		if (index >= precent.length)
			return null;
		else
			return precent[index];
	}

	
}
