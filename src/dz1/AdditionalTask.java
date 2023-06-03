package dz1;

import java.util.regex.Pattern;

public class AdditionalTask {
    public boolean validData(String login, String password, String confirmPassword) {
        if (checkNotValidLoginContent(login)) {
            throw new RuntimeException("Логин содержит запрещенные имволы");
        }
        if (checkNotValidLength(login)) {
            throw new RuntimeException("Длина логина от 4 до 8 включительно");
        }
        if (checkNotValidLength(password)) {
            throw new RuntimeException("Длина пароля от 4 до 8 включительно");
        }
        if (checkNotValidPasswordContent(password)) {
            throw new RuntimeException("Пароль должен содержать только цифры");
        }
        if (!(password.equals(confirmPassword))) {
            throw new RuntimeException("Пароли не одинаковые");
        }
        return true;
    }

    private boolean checkNotValidPasswordContent(String pass) {
        return !Pattern.matches("[0-9]*", pass);
    }

    private boolean checkNotValidLength(String s) {
        return !(s.length() >= 4 && s.length() <= 8);
    }

    private boolean checkNotValidLoginContent(String login) {
        return !Pattern.matches("[[a-e]*[01]*]*", login);
    }

}
