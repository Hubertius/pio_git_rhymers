package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

	public defaultCountingOutRhymer temp = new defaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.countIn(super.countOut());
		int ret = temp.countOut();
		while (!temp.callCheck())
			countIn(temp.countOut());
		return ret;
	// Klawisze (alt + left scroll) || (alt + right scroll) pozwalają 
	// na przemieszczanie się w tył / przód w dotychczas edytowanych plikach
	}
}
