package dz3;

import dz3.myException.DateException;
import dz3.myException.GenderException;
import dz3.myException.MyNameException;
import dz3.myException.PhoneException;

import java.util.regex.Pattern;

public class ValidData {
    public boolean checkValidData(String[] data) throws MyNameException, DateException, PhoneException, GenderException {
        for (int i = 0; i < 3; i++) {
            if (!validName(data[i])) {
                throw new MyNameException(data[i]);
            }
        }
        if (!validDate(data[3])) {
            throw new DateException();
        }
        if (!validPhone(data[4])){
            throw new PhoneException();
        }
        if (!validGender(data[5])){
            throw new GenderException();
        }
        return true;
    }

    private boolean validName(String s) {
        return Pattern.matches("[А-я]*[A-z]*", s);
    }

    private boolean validGender(String s) {
        return s.equals("f") || s.equals("m");
    }

    private boolean validDate(String s) {
        return Pattern.matches("[0-9]{2}\\.[0-9]{2}\\.[0-9]{4}", s);
    }

    private boolean validPhone(String s) {
        return Pattern.matches("[0-9]{10}", s);
    }
}
