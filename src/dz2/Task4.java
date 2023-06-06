package dz2;

import java.util.Scanner;

public class Task4 {
    public String tack4() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.equals("")){
            throw new RuntimeException("Нельзя ввоить пустые строки");
        }
        return s;
    }
}
