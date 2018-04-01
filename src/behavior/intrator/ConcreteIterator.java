package behavior.intrator;

public class ConcreteIterator implements Iterator {
	
	private ConcreteTeacher teacher;
	private int index = 0;
	private int size = 0;
	
	public ConcreteIterator(ConcreteTeacher teacher) {
		this.teacher = teacher;
		size = teacher.getSize();
	}
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if (index < size) {
			index++; 
		}
	}

	@Override
	public boolean isDone() {
		return index > (size - 1);
	}

	@Override
	public Object currentItem() {
		return teacher.getElement(index);
	}

}
