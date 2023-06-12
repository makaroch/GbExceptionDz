package dz3.myException;

public class MyAmountDataException extends Exception{
    public MyAmountDataException(int lenData, int planData) {
        super(String.format("Количество данных не совпадает, введено %d, планировалось %d.", lenData, planData));
    }
}
