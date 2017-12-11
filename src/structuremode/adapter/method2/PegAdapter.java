package structuremode.adapter.method2;

import structuremode.adapter.SquarePeg;

public class PegAdapter implements ISquarePeg, IRoundPeg {

	private RoundPeg roundPeg;
	private SquarePeg squarePeg;
	
	public PegAdapter(RoundPeg peg){
		this.roundPeg = peg;
	}
	
	public PegAdapter(SquarePeg peg){
		this.squarePeg = peg;
	}

	@Override
	public void insert(String msg) {
		// TODO Auto-generated method stub
		roundPeg.insertIntohole(msg);
	}

	@Override
	public void insertIntohole(String msg) {
		// TODO Auto-generated method stub
		squarePeg.insert(msg);
	}

}
