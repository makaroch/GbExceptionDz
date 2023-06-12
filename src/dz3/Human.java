package dz3;

public class Human {
    private String surname;
    private String name;
    private String patronymic;
    private String date;
    private String phone;
    private String gender;

    public Human(String[] data) {
        this.surname = data[0];
        this.name = data[1];
        this.patronymic = data[2];
        this.date = data[3];
        this.phone = data[4];
        this.gender = data[5];
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic + " " + date + " " + phone + " " + gender + "\n";
    }
}
