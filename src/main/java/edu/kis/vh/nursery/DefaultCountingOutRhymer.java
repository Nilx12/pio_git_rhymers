package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INITIAL_TOTAL = -1;
    public static final int NUMBER_OF_NUMBERS = 12;
    public static final int RETURN_ERROR_VALUE = -1;

    private final int[] NUMBERS = new int[NUMBER_OF_NUMBERS];
    public int total = INITIAL_TOTAL;

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
