package by.itstep.pashka.model.logic;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArraySorterTest {

    private int[] array;

    @Before
    public void init() {
        array = new int[]{5, 4, 3};
    }

    @After
    public void destroy() {
        array = null;
    }

    @Test
    public void testBubbleSortAsc() {

        int[] expected = {3, 4, 5};

        ArraySorter.bubbleSortAsc(array);
        assertArrayEquals(expected, array);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != expected[i]) {
//                fail();
//            }
//        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortWithNull() {
        ArraySorter.bubbleSortAsc(null);
    }

    @Test
    public void testBubbleSortWitEmptyObject() {
        ArraySorter.bubbleSortAsc(new int[0]);
    }


    @Test
    public void testSelectedSortAsc() {

        int[] expected = {3, 4, 5};

        ArraySorter.selectedSortAsc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortWithNull() {
        ArraySorter.selectedSortAsc(null);
    }

    @Test
    public void testSelectedSortWitEmptyObject() {
        ArraySorter.selectedSortAsc(new int[0]);
    }


    @Test
    public void testSelectedSortDesc() {

        int[] expected = {5, 4, 3};

        ArraySorter.selectedSortDesc(array);
        assertArrayEquals(expected, array);


    }

    @Test(expected = RuntimeException.class)
    public void testSelectedSortDescWithNull() {
        ArraySorter.selectedSortDesc(null);
    }

    @Test
    public void testSelectedSortDescWitEmptyObject() {
        ArraySorter.selectedSortDesc(new int[0]);
    }


    @Test
    public void testBubbleSortDesc() {

        int[] expected = {5, 4, 3};

        ArraySorter.bubbleSortDesc(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != expected[i]) {
                fail();
            }
        }
    }

    @Test(expected = RuntimeException.class)
    public void testBubbleSortDescWithNull() {
        ArraySorter.bubbleSortDesc(null);
    }

    @Test
    public void testBubbleSortDescWitEmptyObject() {
        ArraySorter.bubbleSortDesc(new int[0]);
    }
}
