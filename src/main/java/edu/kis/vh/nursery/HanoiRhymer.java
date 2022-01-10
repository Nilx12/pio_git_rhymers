package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int INITIAL_REJECTED = 0;
	int totalRejected = INITIAL_REJECTED;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
		}
}
// bledne wiersze 5,12,15,16
// kombinacje klawiszy alt ze strzałkami to przesuwanie się po otwartych kartach projektu
