package by.itstep.pashka.model.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {
    @Test
    public void testBubbleSortAsc() {
        int[] array = {5, 4, 3};
        int[] expected = {3, 4, 5};

        ArraySorter.bubbleSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortWithNull() {
        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortWitEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);
    }
}
