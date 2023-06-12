package dz3.myException;

public class PhoneException extends Exception{
    public PhoneException() {
        super("Телефон не указан не точно");
    }
}
