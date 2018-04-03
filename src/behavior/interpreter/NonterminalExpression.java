package behavior.interpreter;

public class NonterminalExpression implements AbstractException {

	private AbstractException successor;
	
	
	public void setSuccessor(Context context) {
		this.successor = successor;
	}

	public AbstractException getSuccessor() {
		return successor;
	}
	
	@Override
	public void interpret(Context context) { } 
}
