package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

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
