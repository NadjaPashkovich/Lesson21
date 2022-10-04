package by.itstep.pashka.model.logic;

public class ArraySorter {
    public static void bubbleSortAsc(int[ ] array){
        int count = 0;
        if (array == null){
            throw new RuntimeException();
        }

        for (int j = 0; j <array.length -1 ; j++) {
        for (int i = 0; i < array.length - 1; i++) {
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
}
