package edu.kis.vh.nursery;

<<<<<<< HEAD:src/main/java/edu/kis/vh/nursery/defaultCountingOutRhymer.java
public class defaultCountingOutRhymer {
	
	private static final int CAPACITY = 12;
    private static final int EMPTY_INDEX = -1;
    private static final int FULL_INDEX = 11;
=======
public class DefaultCountingOutRhymer {
>>>>>>> 0ec0a8d (4.1 poprawa nazw klas):src/main/java/edu/kis/vh/nursery/DefaultCountingOutRhymer.java

    private int[] numbers = new int[CAPACITY];
    private int total = EMPTY_INDEX;

    public void countIn(int in) {
        if (!isFull()) {
            numbers[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == EMPTY_INDEX;
    }

    public boolean isFull() {
        return total == FULL_INDEX;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return EMPTY_INDEX;
        }
        return numbers[total];
    }

    public int countOut() {
        if (callCheck()) {
            return EMPTY_INDEX;
        }
        return numbers[total--];
    }

}
