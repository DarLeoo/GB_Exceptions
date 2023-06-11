package task_2;

import java.util.Arrays;

public class Main {

    /*Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
     каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
    Если длины массивов не равны, необходимо как-то оповестить пользователя.*/
    public static void main(String[] args)throws Exception {

        ArrayMeth calk = new ArrayMeth();
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{3, 2, 1};
        System.out.println(Arrays.toString(calk.findDifference(array1, array2)));

        array1 = new int[]{1, 2, 3};
        array2 = new int[]{4, 5, 6,7};
        System.out.println(Arrays.toString(calk.findDifference(array1, array2)));
    }
}
