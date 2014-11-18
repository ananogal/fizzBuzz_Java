import org.junit.*;
import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void startUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void isDivisibleByThree(){
        assertTrue(fizzBuzz.isDivisibleByThree(3));
    }

    @Test
    public void isNotDivisibleByThree(){
        assertFalse(fizzBuzz.isDivisibleByThree(1));
    }

    @Test
    public void isDivisibleByFive(){
        assertTrue(fizzBuzz.isDivisibleByFive(5));
    }

    @Test
    public void isNotDivisibleByFive(){
        assertFalse(fizzBuzz.isDivisibleByFive(1));
    }

    @Test
    public void isDivisibleByFifteen(){
        assertTrue(fizzBuzz.isDivisibleByFifTeen(15));
    }

    @Test
    public void isNotDivisibleByFifteen(){
        assertFalse(fizzBuzz.isDivisibleByFifTeen(1));
    }

    @Test
    public void itShouldSayFizzWhenDivisibleByThree(){
        assertEquals("Fizz", fizzBuzz.sayFizzBuzz(3));
    }

    @Test
    public void itShouldSayBuzzWhenDivisibleByFive(){
        assertEquals("Buzz", fizzBuzz.sayFizzBuzz(5));
    }

    @Test
    public void itShouldSayFizzBuzzWhenDivisibleByFifteen(){
        assertEquals("FizzBuzz", fizzBuzz.sayFizzBuzz(15));
    }

    @Test
    public void itShouldSayTheNumberWhenNotDisivibleBy3Or5or15(){
        assertEquals("1", fizzBuzz.sayFizzBuzz(1));
    }

}
