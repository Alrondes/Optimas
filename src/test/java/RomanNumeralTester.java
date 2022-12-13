import org.example.RomanNumeralToInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTester {
    @Test
    public void ifAfterLargerNumber() {
        Integer returnedInteger = RomanNumeralToInt.RomanNumeralT0Int("LXX");
        Assertions.assertEquals(70, returnedInteger);
    }
    @Test
    public void ifBeforeLargerNumber() {
        Integer returnedInteger = RomanNumeralToInt.RomanNumeralT0Int("IX");
        Assertions.assertEquals(9, returnedInteger);
    }
}
