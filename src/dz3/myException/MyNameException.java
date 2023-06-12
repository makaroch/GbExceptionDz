package dz3.myException;

public class MyNameException extends Exception {
    public MyNameException(String s) {
        super("Имя: " + s + " - не строка");
    }
}
