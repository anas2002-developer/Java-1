

abstract class Car{
    abstract void length();
}
class Suv extends Car{

    void length(){
        System.out.println("Max");
    }
}
class Sedan extends Car{

    void length(){
        System.out.println("Mid");
    }
}


public class abstractClasss {
    public static void main(String[] args) {
        Suv s=new Suv();
        Car s2=new Sedan();
        s.length();
        s2.length();
    }

}
