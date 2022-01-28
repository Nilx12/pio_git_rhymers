package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int INITIAL_TOTAL = -1;
    private static final int NUMBER_OF_NUMBERS = 12;
    private static final int RETURN_ERROR_VALUE = -1;

    private final int[] NUMBERS = new int[NUMBER_OF_NUMBERS];
    private int total = INITIAL_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == INITIAL_TOTAL;
    }

    public boolean isFull() {
        return total == (NUMBER_OF_NUMBERS - 1);
    }

    protected int peekaboo() {
        if (callCheck())
            return RETURN_ERROR_VALUE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return RETURN_ERROR_VALUE;
        return NUMBERS[total--];
    }

}
