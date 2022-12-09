package fundamentals;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MakeNegativeTest {

    private int makeNegative(int i) {
        return i > 0 ? i = -i : i;
    }

    @Test
    public void makeNegativeTest() {
        assertEquals(-42, makeNegative(42));
    }
}
