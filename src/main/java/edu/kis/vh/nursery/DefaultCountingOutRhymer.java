package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	public static final int SIZE = 12;
	public static final int FAILED = -1;


	private final int[] numbers = new int[SIZE];

	public int total = FAILED;
  
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == FAILED;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (callCheck())
			return FAILED;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return FAILED;
		return numbers[total--];
	}

	public int getTotal() {
		return total;
	}

	
	

}
