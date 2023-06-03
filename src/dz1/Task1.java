package dz1;

public class Task1 {
    //Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
    public void exception1(){
        int[] array = new int[8];
        System.out.println(array[5]);
        System.out.println(array[array.length]);
    }
    public void exception2(int x){
        System.out.println(x / 0);
    }
    public void exception3(){
        Task1 task1 = null;
        task1.exception1();
    }
}
