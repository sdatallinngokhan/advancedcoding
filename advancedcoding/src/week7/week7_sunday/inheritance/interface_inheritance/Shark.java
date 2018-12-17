package week7.week7_sunday.inheritance.interface_inheritance;

public class Shark implements Animal{

    @Override
    public String breathingType() {
        return "gills";
    }

    @Override
    public int getAverageLifeDuration() {
        return 5;
    }
}
