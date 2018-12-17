package week7.week7_saturday.inheritance;

public class Bus extends Vehicle {

    public String energySource = "diesel";
    public Integer passengerCapacity;

    public void useCommonVariables(){
        System.out.println(this.energySource); // pointing out different place in memory
        System.out.println(super.energySource);// pointing out different place in memory

        this.energySource = "fuel2";
        System.out.println(this.energySource);
        System.out.println(super.energySource);

        super.energySource = "fuel3";
        System.out.println(this.energySource);
        System.out.println(super.energySource);
    }

    public void useUncommonVariables(){
        System.out.println(this.environmentType); // pointing out same place in memory
        System.out.println(super.environmentType);// pointing out same place in memory

        this.environmentType = "air";

        System.out.println(this.environmentType);
        System.out.println(super.environmentType);
    }

    public void test(){
        System.out.println(super.environmentType);
        System.out.println(this.environmentType);
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.useCommonVariables();
        System.out.println("---------");
        bus.useUncommonVariables();
    }
}
