package dz3;

import dz2.Task1;
import dz2.Task2AndTask3;
import dz2.Task4;
import dz3.Human;
import dz3.InputData;
import dz3.ValidData;
import dz3.WriteHuman;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        InputData inputData = new InputData();
        ValidData validData = new ValidData();
        boolean continueFlag;
        String[] data = null;
        do {
            try {
                data = inputData.getData();
                continueFlag = !validData.checkValidData(data);
            } catch (Exception e) {
                e.printStackTrace();
                continueFlag = true;
            }
        } while (continueFlag);

        WriteHuman writeHuman = new WriteHuman();
        writeHuman.write(new Human(data));
    }


}