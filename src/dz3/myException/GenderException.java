package dz3.myException;

public class GenderException extends Exception{
    public GenderException() {
        super("Пол указан не верно");
    }
}
