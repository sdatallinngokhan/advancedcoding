package week7.week7_saturday.encapsulation;

public class EncapsulationTest {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        System.out.println("Age : " + encapsulation.age);
        System.out.println("Name : " + encapsulation.name);

        encapsulation.age = 43;

        System.out.println("Age : " + encapsulation.age);

        System.out.println("Surname : " + encapsulation.getSurname());

        encapsulation.setSurname("House");

        System.out.println("Surname : "+encapsulation.getSurname());
    }
}
//


//git@github.com:sdatallinngokhan/advancedcoding.git
//
//        https://github.com/sdatallinngokhan/advancedcoding.git