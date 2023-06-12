package dz3;

import dz3.myException.MyAmountDataException;

import java.util.Arrays;
import java.util.Scanner;

public class InputData {
    public String[] getData(){
        System.out.println("Введите: фамилию, имя, отчество, дату рождения, номер телефона, пол.");
        Scanner scanner = new Scanner(System.in);
        try{
            String s = scanner.nextLine();
            return splitData(s, 6);
        } catch (MyAmountDataException e) {
           e.printStackTrace();
           return getData();
        }
    }

    private String[] splitData(String s, int countData) throws MyAmountDataException {
        String[] res = s.split(" ");
        if (res.length != countData){
            throw new MyAmountDataException(res.length, countData);
        }
        return res;
    }


}
