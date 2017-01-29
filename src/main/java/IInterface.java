/**
 * Created by SSS on 29.01.2017.
 */
interface ISuperInterface {

    public static final int field = 100;
    int filed2 = 100;
    int sameFiled = 100;

    void sameMethod();

    default int defaultMethod(){
        return 0;
    }

    static int staticMethod()
    {
        return 0;
    }

    //default не может быть с final
    //default final int getUnit(){ return 100; }

    //Интерфейс не может иметь тело метода
        //        public int getLength()
        //        {
        //            return 0;
        //        }
}

interface ISubInterface extends ISuperInterface
{
    //Static метод не может oveкride default method
    //public static int defaultMethod(){ return 10;}

    //интерфейсный метод может быть ovveride default
    int defaultMethod();

    //
    int sameFiled = 100;

    public static int staticMethod() {
        return 10;
    }

    void sameMethod();
}

class interfaceSample implements ISuperInterface, ISubInterface
{


    public static void main(String[] args) {


        ISuperInterface iSuperInterface = new ISubInterface() {
            @Override
            public void sameMethod() {

            }

            @Override
            public int defaultMethod() {
                return 0;
            }
        };

        iSuperInterface.defaultMethod();
        //static intarface method нельзя вызвать из класса
        //iSuperInterface.staticMethod();
    }

    //Методы с одинаковым названием могут быть в разных интерфейсах
    //Если класс implement два интерфейса и в них есть два default метода с одинаковым названием
    //то класс должен его implement
    @Override
    public void sameMethod() {

    }


    @Override
    public int defaultMethod() {
        return 0;
    }
}
