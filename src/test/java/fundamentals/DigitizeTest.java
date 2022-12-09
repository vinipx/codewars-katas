package fundamentals;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class DigitizeTest {

    private static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }

    @Test
    public void digitizeTest() {
        assertArrayEquals(new int[]{1, 3, 2, 5, 3}, digitize(35231));
        assertArrayEquals(new int[]{0}, digitize(0));
    }
}
