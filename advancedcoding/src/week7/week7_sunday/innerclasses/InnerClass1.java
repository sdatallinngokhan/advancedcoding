package week7.week7_sunday.innerclasses;

public class InnerClass1 {

    public int number = 5;

    public void innerClass1Method1(){
        InnerClass4 innerClass4 = new InnerClass4();
        innerClass4.innerClass4Method1();
    }

    public static void main(String[] args) {
        InnerClass1 innerClass1 = new InnerClass1();
        innerClass1.innerClass1Method1();
    }

    public class InnerClass4 {

        public void innerClass4Method1(){
            InnerClass1 innerClass1 = new InnerClass1();
            System.out.println(number);
            innerClass1.number = 8;
            System.out.println(number);
            number = 7;
            System.out.println(number);
        }

        public class InnerClass5{

        }
    }
}

class InnerClass2 {

    public void innerClass2Method1() {
        InnerClass1 innerClass1 = new InnerClass1();
        InnerClass1.InnerClass4 innerClass4 = innerClass1.new InnerClass4();

        innerClass4.innerClass4Method1();

        innerClass1.number = 6;
    }
}

class InnerClass3 {

}
