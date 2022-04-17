package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GroupingDifferenceTest extends NumberDifferenceTest {

    @Test //TC1
    public void testDifferenceResultInGroup1_01() {
        Arrays.asList(10, 6);
        int diff = 4;
        String actual, expected = "Difference : " + diff + "\nGroup 1, Small Difference";

        actual = sut.groupingDifference(diff);
        assertEquals(expected, actual);
    }

    @Test //TC2
    public void testDifferenceResultInGroup1_02() {
        Arrays.asList(20, 10);
        int diff = 10;
        String actual, expected = "Difference : " + diff + "\nGroup 1, Small Difference";

        actual = sut.groupingDifference(diff);
        assertEquals(expected, actual);
    }

    @Test //TC3
    public void testDifferenceResultInGroup1_03() {
        Arrays.asList(10, 9);
        int diff = 1;
        String actual, expected = "Difference : " + diff + "\nGroup 1, Small Difference";

        actual = sut.groupingDifference(diff);
        assertEquals(expected, actual);
    }
    
    @Test // TC8
    public void testDifferenceResultInGroup2_01() {
        // (1) setup (arrange, build)
        int diff = 25; // range 11-50
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC9
    public void testDifferenceResultInGroup2_02() {
        // (1) setup (arrange, build)
        int diff = 50; // batas atas range group 2 (11-50)
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC10
    public void testDifferenceResultInGroup2_03() {
        // (1) setup (arrange, build)
        int diff = 11; // batas bawah range group 2 (11-50)
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC11
    public void testDifferenceResultInGroup3_01() {
        // (1) setup (arrange, build)
        int diff = 65;// range group 3 (>50)
        String actual, expected = "Difference : " + diff + "\nGroup 3, Large Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC12
    public void testDifferenceResultInGroup3_02() {
        // (1) setup (arrange, build)
        int diff = 51;// batas bawah range group 3 (>50)
        String actual, expected = "Difference : " + diff + "\nGroup 3, Large Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC13
    public void testDifferenceResultNoGroup_01() {
        // (1) setup (arrange, build)
        int diff = 0;// tidak termasuk ke dalam group manapun
        String actual, expected = "Non group, There's no difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC14
    public void testDifferenceResultNoGroup_02() {
        // (1) setup (arrange, build)
        int diff = 0;// tidak termasuk ke dalam group manapun
        String actual, expected = "Non group, There's no difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

}
