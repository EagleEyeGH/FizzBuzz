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
    @DisplayName("Testing if FizzBuzz Exception is thrown")
    public void testIfFizzBuzzExceptionIsThrown() {
        assertThrows(FizzBuzzException.class, () -> {
            fizzBuzz.startFizzBuzz(false);
        });
    }
}
