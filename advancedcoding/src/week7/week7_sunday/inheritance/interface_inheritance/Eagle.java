package week7.week7_sunday.inheritance.interface_inheritance;

public class Eagle implements Animal {

    @Override
    public String breathingType() {
        return "lung";
    }

    @Override
    public int getAverageLifeDuration() {
        return 3;
    }
}
