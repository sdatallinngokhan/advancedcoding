package week7.week7_saturday.encapsulation;

public class Encapsulation {

    public String name = "Jack";
    public int age = 30;
    private String surname = "London";


    public String getSurname() {
        if (surname.equals("London")) {
            return "Paris";
        }
        return surname;
    }

    public void setSurname(String surname) {
        if (surname == "House") {
            this.surname = "Home";
        } else {
            this.surname = surname;
        }

    }
}
