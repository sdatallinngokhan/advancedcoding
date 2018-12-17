package week7.week7_sunday.polymorphism;

public class PolymorphismImpl implements FirstPolymorphismInterface, SecondPolymorphismInterface {

    @Override
    public Integer getNumber() {
        return 5;
    }

    @Override
    public String getName() {
        return "table";
    }
}
