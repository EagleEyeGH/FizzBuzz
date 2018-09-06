package nl.han.dea.emilio;

import static junit.framework.TestCase.assertEquals;
import static org.apache.commons.math3.primes.Primes.isPrime;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.stream.IntStream;

public class FizzBuzzTest
{

    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testStartFizzBuzz() throws Exception {
        final int[] result = new int[]{0, 1, 2, 3, 4, 5};
        final IntStream stream = IntStream.range(0, result.length);
        stream.forEach(it -> {
            assertEquals(result[it], it);
        });
    }
    @Test
    public void testIfIsPrimeRetursTrue() {
        assertEquals(isPrime(2), true);
    }
}
