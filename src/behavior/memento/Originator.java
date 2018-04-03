package behavior.memento;

import java.io.File;
import java.io.Serializable;

public class Originator {
	
	private int number;
	private File file = null;
	
	public Memento getMemento() {
		return new Memento(this);
	}
	
	public void setMemento(Memento m) {
		number = m.number;
		file = m.file;
	}
	
	private class Memento implements Serializable {
		private int number;
		private File file = null;
		
		public Memento (Originator o) {
			number = o.number;
			file = o.file;
		}
	}
}
