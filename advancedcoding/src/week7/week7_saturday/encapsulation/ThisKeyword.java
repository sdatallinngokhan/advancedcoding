package week7.week7_saturday.encapsulation;

public class ThisKeyword {

    String name = "something";

    public void printVariable(){
        System.out.println(name);

        String name = "something3";
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword=new ThisKeyword();
        thisKeyword.printVariable();
    }
}
