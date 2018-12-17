package week7.week7_saturday.inheritance;

public class InheritanceTest {

    public static void main(String[] args) {
        Bus bus = new Bus();
        Train train = new Train();

        System.out.println(bus.environmentType);
        System.out.println(train.environmentType);

        System.out.println("---------");

        bus.environmentType = "land";
        System.out.println(bus.environmentType);
        System.out.println(train.environmentType);

        System.out.println("---------");
        bus.test();
        train.test();
    }
}
