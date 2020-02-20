package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter extends Counter {
    private static final int DEFAULT_VALUE = 10;
    private static final int UPPER_LIMIT = 100;

    private int upper_limit;

    public UpperLimitedPositiveCounter() {
        this(DEFAULT_VALUE);
    }

    public UpperLimitedPositiveCounter(int value) {
        this(value, UPPER_LIMIT);
    }

    public UpperLimitedPositiveCounter(int value, int upper_limit) {
        super(value);
        this.upper_limit = upper_limit;
    }

    @Override
    public void inc() throws CounterException {
        super.inc();
        checkValue(getValue());
    }

    @Override
    public void add(int step) throws CounterException {
        super.add(step);
        checkValue(getValue());
    }

    @Override
    public int getValue() {
        return super.getValue();
    }

    private void checkValue(int value) throws CounterException {
        if (value < 0 )
            throw new CounterException("Limite inférieur dépassée (0)");

        if(value > upper_limit)
            throw new CounterException("Limite supérieur dépassée (" + upper_limit + ")");
    }
}
