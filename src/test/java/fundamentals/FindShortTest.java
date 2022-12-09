package fundamentals;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertEquals;

public class FindShortTest {

    private static int findShort(String s) {
        String[] words = s.split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String str : words) {
            result.put(str, str.length());
        }
        return result.entrySet().stream()
                .filter(p -> Arrays.asList(words).contains(p.getKey()))
                .min(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();
    }

    @Test
    public void testFindShort() {
        assertEquals(3, findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, findShort("Let's travel abroad shall we"));
    }
}
