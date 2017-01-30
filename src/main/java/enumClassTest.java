/**
 * Created by SSS on 29.01.2017.
 */
enum enumTest {
    ON, OFF
}

//Нельзя два public класса в файле
//public enum EnumA{ A, AA, AAA};

enum VehicleType {

    SUV, SEDAN, VAN, SPORTSCAR;

    //Для каждого экземпляра enum(SUV, SEDAN, VAN, SPORTSCAR) вызовется конструктор(4 раза)
    VehicleType() {
        System.out.println("VehicleType Constructor");
    }

}

enum Coffee  //1
{
    ESPRESSO("Very Strong"), MOCHA(""), LATTE(""); //2
    public String strength; //3

    Coffee(String strength) //4
    {
        this.strength = strength; //5
    }

    Coffee() {

    }
}

enum EnumA implements I {
    A, AA, AAA
}



interface I {
    default int mth() {
        return 1;
    }

    ;
}

public class enumClassTest {

    public enumClassTest() {
        //
        //enum EnumD{ D, DD, DDD } //5
    }

    ; //3

    public static void main(String[] args) //7
    {
        //enum EnumF{ F, FF, FFF}; //8

        System.out.println(VehicleType.SEDAN);
        System.out.println(VehicleType.SUV);
        System.out.println(Pets.CAT);
    }

    ; //4

    public void methodX() {
        //public enum EnumE{ E, EE, EEE } //6
    }

    void method() {
        enumTest s = enumTest.OFF;
        if (s == enumTest.OFF) {
            System.out.println("It is off!");
        }
        if (s.equals(enumTest.OFF)) {
            System.out.println("It is off!");
        }

        //В case нельзя использовать enumTest.OFF, а можно OFF
        //        switch (s) {
        //            case enumTest.OFF:
        //                System.out.println("It is off!");
        //                break;
        //        }
        switch (s) {
            case OFF:
                System.out.println("It is off!");
                break;
        }
    }

    //Можно объявлять несколько public enum
    public enum EnumB {
        B, BB, BBB
    }

    public static enum EnumC {C, CC, CCC}
}


enum Pets {
    DOG("D"),
    CAT("C")
    {
        public void ss(){
            System.out.println(" CAT");
        }

    }

    , FISH("F")

    ;
    String name;
     static String prefix = "I am ";

    Pets(String s) {
        //Unlike a regular java class, you cannot access a non-final static field from an enum's constructor. ( JLS 8.9.2 )
        //name = prefix + s;
    }

    public String getData() {
        return name;
    }
}