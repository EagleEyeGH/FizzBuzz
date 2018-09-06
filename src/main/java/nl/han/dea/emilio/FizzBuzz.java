package nl.han.dea.emilio;

import java.util.stream.IntStream;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class FizzBuzz {
    public static void main (String[] args) {
        try {
            startFizzBuzz(false);
        } catch (FizzBuzzException fbe) {
            System.out.println(fbe.getMessage());
        }
    }

    private static void startFizzBuzz (boolean state) throws FizzBuzzException {
        if(state) {
            IntStream.range(1, 1000).mapToObj(i ->
                    (i % 15 == 0) ? "FIZZBUZZ" :
                            (i % 3 == 0) ? "FIZZ" :
                                    (i % 5 == 0) ? "Buzz" :
                                            (isPrime(i)) ? "Prime" :
                                                    String.valueOf(i)).forEach(j -> System.out.printf("%s%n", j));
        } else {
            throw new FizzBuzzException("state is false");
        }
    }
}
