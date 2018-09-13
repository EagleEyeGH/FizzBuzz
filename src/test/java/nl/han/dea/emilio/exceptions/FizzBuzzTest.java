package nl.han.dea.emilio.exceptions;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest
{
    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testIfFizzBuzzExceptionIsThrown() {
        assertThrows(FizzBuzzException.class, () -> {
            fizzBuzz.startFizzBuzz(false);
        });
    }
}
