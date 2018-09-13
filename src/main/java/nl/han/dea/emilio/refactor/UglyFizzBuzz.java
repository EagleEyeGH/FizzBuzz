package nl.han.dea.emilio.refactor;

public class UglyFizzBuzz extends MotherOfAllFizzBuzzes {

    public static void main (String[] args) {
        UglyFizzBuzz uglyFizzBuzz = new UglyFizzBuzz();
        MeAlsoFizzBuzz meAlsoFizzBuzz = new MeAlsoFizzBuzz();
        uglyFizzBuzz.doFizzBuzz();
        meAlsoFizzBuzz.doFizzBuzz();
    }

    protected boolean isDivisableBy (int i, int diviser) {
            return i % diviser == 0;
    }
}
