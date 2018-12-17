package week7.week7_sunday.inheritance.interface_inheritance;

public class FirstInterfaceImpl implements FirstInterface, SecondInterface {

    final int b = 7;

    @Override
    public String getEnergySource() {
        return null;
    }

    @Override
    public int getANumber() {
        return 5;
    }

    @Override
    public String getEnvironmentType() {
        return "AIR";
    }


}
