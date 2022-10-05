package by.itstep.pashka.model.logic;

public class ArraySorter {
    public static void selectedSortAsc(int[] array) {

        if (array == null) {
            throw new RuntimeException();
        }
        for (int j = 0; j < array.length - 1; j++) {

            int indexMinElement = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[indexMinElement] > array[i]) {
                    indexMinElement = i;
                }
            }
            int t = array[j];
            array[j] = array[indexMinElement];
            array[indexMinElement] = t;
        }
    }

    public static void selectedSortDesc(int[] array) {
        if (array == null) {
            throw new RuntimeException();
        }
        for (int j = 0; j < array.length - 1; j++) {

            int indexMaxElement = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[indexMaxElement] < array[i]) {
                    indexMaxElement = i;
                }
            }
            int t = array[j];
            array[j] = array[indexMaxElement];
            array[indexMaxElement] = t;
        }
    }


    public static void bubbleSortAsc(int[] array) {
        int count = 0;
        if (array == null) {
            throw new RuntimeException();
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);
    }

    public static void bubbleSortDesc(int[] array) {
        int count = 0;
        if (array == null) {
            throw new RuntimeException();
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                count++;
                if (array[i] < array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;

                }
            }
        }
        System.out.println("count = " + count);
    }
}
