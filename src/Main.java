import dz1.AdditionalTask;
import dz1.Task3and4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AdditionalTask additionalTask = new AdditionalTask();
        boolean flag = additionalTask.validData("10d0e1ab", "111119999", "11111999");
        System.out.println(flag);
    }

    public static void task3() {
        Task3and4 task3 = new Task3and4();
        int[] arr = task3.difference(new int[]{1, 3, 3, 5}, null);
        System.out.println(Arrays.toString(arr));
    }

    public static void task4() {
        Task3and4 task4 = new Task3and4();
        int[] arr = task4.division(new int[]{1, -3, 3, 5}, new int[]{1, 3, 3, 99});
        System.out.println(Arrays.toString(arr));

    }
}