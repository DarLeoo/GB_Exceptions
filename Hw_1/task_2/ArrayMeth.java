package task_2;

public class ArrayMeth {
    public int[] findDifference(int[] arr1, int[] arr2) throws Exception{
        if (arr1.length != arr2.length){
            throw new Exception("Метод не может быть реализова, т.к. длинны массивов не совпадают");}
        int [] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] - arr2[i];
        }
        return arr3;
    }
}
