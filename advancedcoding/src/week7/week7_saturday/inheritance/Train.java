package week7.week7_saturday.inheritance;

public class Train extends Vehicle {

    @Override
    public Integer age(){
        return 1;
    }

    // overloading
    public int age(String useless1, String useless2){
        return 55;
    }

    // overloading
    public int age(String useless){
        return 55;
    }

    // overloading
    public int age(Integer use){
        return 5;
    }

    public void useInheritedMethods(){
        System.out.println(super.age());
        System.out.println(this.age());
    }

    public void test() {
        System.out.println(super.environmentType);
        System.out.println(this.environmentType);
    }


    public static void main(String[] args) {
        Train train = new Train();
        train.useInheritedMethods();
    }
}
