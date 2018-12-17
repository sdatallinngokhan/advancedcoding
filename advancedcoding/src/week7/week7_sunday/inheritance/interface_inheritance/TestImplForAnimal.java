package week7.week7_sunday.inheritance.interface_inheritance;

public class TestImplForAnimal {

    public static void main(String[] args) {
        Eagle eagle = new Eagle();
        Shark shark = new Shark();

        System.out.println("Eagle BT : "+eagle.breathingType());
        System.out.println("Eagle LD : "+eagle.getAverageLifeDuration());
        System.out.println("Shark BT : "+shark.breathingType());
        System.out.println("Shark LD : "+shark.getAverageLifeDuration());
    }
}
