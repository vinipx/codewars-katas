package fundamentals;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberStringExampleTest {

    private static String numberToString(int num) {
        return String.valueOf(num);
    }

    @Test
    public void tests() {
        assertEquals("67", numberToString(67));
        assertEquals("123", numberToString(123));
        assertEquals("999", numberToString(999));
    }
}
