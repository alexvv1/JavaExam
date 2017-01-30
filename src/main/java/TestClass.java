/**
 * Created by SSS on 29.01.2017.
 */
class OuterClass {

    int field = 1;

    public abstractClass getSomeClass() {
        return new abstractClass() {
            public void m1() {
            }
        };
    }

    //inner class may be static
    public static class StaticInnetClass {
        //static class могут содержать не static class
        class innerClass{}
    }

    public class publicInnerClass {


        final static int finalStaticFiels = 0;

        //inner class не могут содержать not-final static field
        //static int staticFiels = 0;

        //inner class не могут содержать static method
        //static void staticMethod() {
        //}

        //Не static class не могут содержать в себе static
        //static class p{}

        void method(){
            class classInnerMethod{}
            //class inner method не могут быть статические
            //static class stativClassInnerMethod{}

            //Обращение к переменной внешнего класса
            int ii = field;
            int i = OuterClass.this.field;
        }
    }

    class defaultInnerClass {
    }

    protected class protectedInnerClass {
    }

    private class privateInnerClass {
    }
}

abstract class abstractClass {
    public abstract void m1();
}
