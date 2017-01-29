/**
 * Created by SSS on 29.01.2017.
 */
enum enumTest {
    ON, OFF
}


public class enumClassTest {

    //Можно объявлять несколько public enum
    public enum EnumB{ B, BB, BBB }; //3
    public static enum EnumC{ C, CC, CCC }; //4
    public enumClassTest()
    {
        //
       //enum EnumD{ D, DD, DDD } //5
    }

    public void methodX()
    {
      //public enum EnumE{ E, EE, EEE } //6
    }

    public static void main(String[] args) //7
    {
       //enum EnumF{ F, FF, FFF}; //8
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
}









