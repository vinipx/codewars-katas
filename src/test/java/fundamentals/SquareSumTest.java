package fundamentals;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SquareSumTest {

    private int squareSum(int[] n) {
        int ret = 0;
        for (int t : n)
            ret += Math.pow(t, 2);
        return ret;
    }

    @Test
    public void squareSumTest() {
        assertEquals(9, squareSum(new int[]{1, 2, 2}));
        assertEquals(5, squareSum(new int[]{1, 2}));
        assertEquals(50, squareSum(new int[]{5, -3, 4}));
        assertEquals(0, squareSum(new int[]{}));
    }
}
