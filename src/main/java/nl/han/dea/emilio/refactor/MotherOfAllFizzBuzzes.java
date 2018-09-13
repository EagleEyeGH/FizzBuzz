package nl.han.dea.emilio.refactor;

public abstract class MotherOfAllFizzBuzzes {
    public static final int BOUNDARY = 1000;
    public static final int FIRST_DIVIDER = 3;
    public static final int SECOND_DIVIDER = 5;
    public static final String FIRZT_EXCLAMATION = "Fizz";
    public static final String SECOND_EXCLAMATION = "Buzz";

    public void doFizzBuzz () {
        for(int i = 0; i < BOUNDARY; i++) {
            if(isDivisableBy(i, FIRST_DIVIDER) || isDivisableBy(i, SECOND_DIVIDER)) {
                writeExclamations(i);
            }
            else {
                System.out.println(i);
            }
        }
    }

    private void writeExclamations (int i) {
        if(isDivisableBy(i, FIRST_DIVIDER)) {
            System.out.println(FIRZT_EXCLAMATION);
        }
        if(isDivisableBy(i, SECOND_DIVIDER)) {
            System.out.println(SECOND_EXCLAMATION);
        }
    }

    protected abstract boolean isDivisableBy (int i, int diviser);
}
