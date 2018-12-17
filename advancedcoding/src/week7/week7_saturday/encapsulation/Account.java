package week7.week7_saturday.encapsulation;

public class Account {

    public static void main(String[] args) {
        User user = new User();

        System.out.println("Username : " + user.getUsername());
        System.out.println("Password : " + user.getPassword());

        user.setPassword("123");

        System.out.println("Password : " + user.getPassword());
    }
}
