import ch.hesge.cours634.counter.Counter;
import ch.hesge.cours634.counter.CounterException;
import ch.hesge.cours634.counter.UpperLimitedPositiveCounter;

public class Main {

    public static void main(String[] args) {
        System.out.println("==== Test Counter ====");
        Counter counter = new Counter(0);
        System.out.println(counter.getValue() == 0);


        try {
            System.out.println();
            System.out.println("Inc counter");
            counter.inc();
            System.out.println("Counter equals 0 : ");
            System.out.println(counter.getValue() == 0);
            System.out.println("Counter equals 1 : ");
            System.out.println(counter.getValue() == 1);

            System.out.println();
            System.out.println("Add 5 to counter");
            counter.add(5);
            System.out.println("Counter equals 1 : ");
            System.out.println(counter.getValue() == 1);
            System.out.println("Counter equals 6 : ");
            System.out.println(counter.getValue() == 6);
        } catch (CounterException e) {
            e.getMessage();
        }

        System.out.println("==== Test UpperLimitedPositiveCounter ====");
        UpperLimitedPositiveCounter upperCounter = new UpperLimitedPositiveCounter(0, 50);
        System.out.println(counter.getValue() == 0);

        try {
            System.out.println();
            System.out.println("Inc counter");
            upperCounter.inc();
            System.out.println("Counter equals 0 : ");
            System.out.println(counter.getValue() == 0);
            System.out.println("Counter equals 1 : ");
            System.out.println(counter.getValue() == 1);

            System.out.println();
            System.out.println("Add 5 to counter");
            upperCounter.add(5);
            System.out.println("Counter equals 1 : ");
            System.out.println(counter.getValue() == 1);
            System.out.println("Counter equals 6 : ");
            System.out.println(counter.getValue() == 6);

            System.out.println();
            System.out.println("Add 50 to counter");
            upperCounter.add(50);
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println();
            System.out.println("Add -100 to counter");
            upperCounter.add(-100);
        } catch (CounterException e) {
            System.out.println(e.getMessage());
        }


    }
}
