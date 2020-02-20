package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private static final int DEFAULT_VALUE = 10;

    private int value;

    public Counter() {
        this(DEFAULT_VALUE);
    }

    public Counter(int value) {
        this.value = value;
    }

    @Override
    public void inc() throws CounterException {
        value = value + 1;
    }

    @Override
    public void add(int step) throws CounterException {
        value = value + step;
    }

    @Override
    public int getValue() {
        return value;
    }
}
