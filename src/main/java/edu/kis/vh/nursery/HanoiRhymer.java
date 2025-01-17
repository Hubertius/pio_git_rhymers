package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
	/*
	  Brakowało powiększenia wcięcia dla linii 12 oraz 
	  jego pomniejszenia dla linii 14 (ponadto linie 13 i 15 powinny mieć 
	  zastosowane jeden tabulator)
	  
	*/
}
