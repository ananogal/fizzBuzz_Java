/**
 * Created by ananogal on 18/11/2014.
 */
public class FizzBuzz {
    public boolean isDivisibleByThree(int number) {
        return isDivisibleBy(number, 3);
    }

    public boolean isDivisibleByFive(int number) {
        return isDivisibleBy(number, 5);
    }

    private boolean isDivisibleBy(int number, int divisor) {
        return number % divisor == 0;
    }

    public boolean isDivisibleByFifTeen(int number) {
        return isDivisibleBy(number, 15);
    }

    public String sayFizzBuzz(int number) {
        if(isDivisibleByFifTeen(number))
            return "FizzBuzz";
        if(isDivisibleByThree(number))
            return "Fizz";
        if(isDivisibleByFive(number))
            return "Buzz";
        return String.valueOf(number);
    }
}
