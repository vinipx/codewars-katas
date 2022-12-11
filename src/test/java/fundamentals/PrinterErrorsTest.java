package fundamentals;

import org.apache.commons.lang3.ArrayUtils;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/*
* In a factory a printer prints labels for boxes. For one kind of boxes the printer has to use colors which, for the sake of simplicity, are named with letters from a to m.
*
*The colors used by the printer are recorded in a control string. For example a "good" control string would be aaabbbbhaijjjm meaning that the printer used three times color a, four times color b, one time color h then one time color a...
*
*Sometimes there are problems: lack of colors, technical malfunction and a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm with letters not from a to m.
*
*You have to write a function printer_error which given a string will return the error rate of the printer as a string representing a rational whose numerator is the number of errors and the denominator the length of the control string. Don't reduce this fraction to a simpler expression.
*
*The string has a length greater or equal to one and contains only letters from ato z.
* */

public class PrinterErrorsTest {

    public static String printerError(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    // Here's an example on how a beginner/novice would try to solve using checks
    public static String printerErrorAlternative(String s) {
        int totalErrors = s.length();
        char[] colors = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};
        char[] letters = s.toCharArray();
        for (char c : letters) {
            if (Character.isLetter(c)) {
                if(ArrayUtils.contains(colors, c)) {
                     totalErrors--;
                }
            }
        }
        return totalErrors + "/" + s.length();
    }

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", printerError(s));
    }
}
