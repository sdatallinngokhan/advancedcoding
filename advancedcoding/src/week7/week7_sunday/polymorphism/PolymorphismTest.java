package week7.week7_sunday.polymorphism;

import java.util.*;

public class PolymorphismTest {

    public static void main(String[] args) {
        PolymorphismImpl polymorphismImpl1 = new PolymorphismImpl();
        System.out.println("Number from class: "+polymorphismImpl1.getNumber());
        System.out.println("Name from class: "+polymorphismImpl1.getName());

        System.out.println("------");

        FirstPolymorphismInterface firstPolymorphismInterface1 = new PolymorphismImpl();
        FirstPolymorphismInterface firstPolymorphismInterface2 = new PolymorphismImpl2();
        System.out.println("Number from firstPolyInterface1: "+firstPolymorphismInterface1.getNumber());
        System.out.println("Number from firstPolyInterface2: "+firstPolymorphismInterface2.getNumber());

        System.out.println("------");

        SecondPolymorphismInterface secondPolymorphismInterface = new PolymorphismImpl();
        System.out.println("Name from secondPolyInterface: "+secondPolymorphismInterface.getName());

        List<String> list1 = new ArrayList();
        List list2 = new LinkedList();
        Set set = new HashSet();
        Map map = new HashMap();

    }
}
