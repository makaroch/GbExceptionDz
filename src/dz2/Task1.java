package dz2;

import java.util.Scanner;

public class Task1 {
    public float getFloat(){
        Scanner scanner = new Scanner(System.in);
        do {
            try{
                System.out.println("Ведите дробь");
                return Float.parseFloat( scanner.nextLine());
            }catch (RuntimeException e){
                System.err.println("Только дробь!");
            }
        }while (true);
    }
}
