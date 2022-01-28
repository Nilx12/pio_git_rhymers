package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int INITIAL_REJECTED = 0;
	private int totalRejected = INITIAL_REJECTED;

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

	public int getTotalRejected() {
		return totalRejected;
	}

	public void setTotalRejected(int totalRejected) {
		this.totalRejected = totalRejected;
	}
}
// bledne wiersze 5,12,15,16
// kombinacje klawiszy alt ze strzałkami to przesuwanie się po otwartych kartach projektu
