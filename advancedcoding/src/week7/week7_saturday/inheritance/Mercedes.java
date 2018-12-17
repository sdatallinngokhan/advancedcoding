package week7.week7_saturday.inheritance;

public class Mercedes extends Bus {

    @Override
    public void useCommonVariables(){
        System.out.println(this.energySource);
        System.out.println(super.energySource);
    }

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();

        System.out.println(mercedes.energySource);

        mercedes.useCommonVariables();
    }
}
