package week7.week7_saturday.encapsulation;

public class User {

    private String username = "abcd";
    private String password = "12345678";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>=8){
            this.password = password;
        }
    }
}
