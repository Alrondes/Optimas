import org.example.RomanNeumeralToInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTester {


    @Test
    public void afterLargerNumber() {
        Integer returnedInteger = RomanNeumeralToInt.RomanNeumeralT0Int("LXX");
        Assertions.assertEquals(70, returnedInteger);
    }
    @Test
    public void beforeLargerNumber() {
        Integer returnedInteger = RomanNeumeralToInt.RomanNeumeralT0Int("LXX");
        Assertions.assertEquals(70, returnedInteger);
    }
}
