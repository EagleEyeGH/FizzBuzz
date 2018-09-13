package nl.han.dea.emilio.exceptions;

import java.util.stream.IntStream;

import static org.apache.commons.math3.primes.Primes.isPrime;

public class FizzBuzz {
    public static void main (String[] args) {
        try {
            startFizzBuzz(true);
        } catch (FizzBuzzException exception) {
        System.out.println(exception.getMessage());
    }
    }

    public static void startFizzBuzz (boolean state) throws FizzBuzzException {
        if(state) {
            IntStream.range(1, 100000).mapToObj(i ->
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
