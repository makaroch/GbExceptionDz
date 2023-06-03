package dz1;

public class Task3and4 {
    public int[] difference(int[] arr1, int[] arr2){
        if (arr2 == null || arr1 == null){
            throw new RuntimeException("Массив не может быть null");
        }
        if (arr2.length != arr1.length){
            throw  new RuntimeException("Длины массивов не раавны");
        }
        int[] res = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i] - arr2[i];
        }
        return res;
    }
    public int[] division(int[] arr1, int[] arr2){
        if (arr2 == null || arr1 == null){
            throw new RuntimeException("Массив не может быть null");
        }
        if (arr2.length != arr1.length){
            throw  new RuntimeException("Длины массивов не раавны");
        }
        int[] res = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0){
                throw new RuntimeException("Нельзя делить на 0");
            }
            res[i] = arr1[i] / arr2[i];
        }
        return res;
    }
}
