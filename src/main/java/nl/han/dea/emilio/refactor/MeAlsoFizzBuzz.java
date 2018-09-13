package nl.han.dea.emilio.refactor;

public class MeAlsoFizzBuzz extends MotherOfAllFizzBuzzes{

    protected boolean isDivisableBy (int i, int diviser) {
        return i % diviser == 0;
    }
}
