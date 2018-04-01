package behavior.intrator;



public interface Teacher {
	public Iterator createIterator ();
	
	public Object getElement(int index);
	
	public int getSize();
}
