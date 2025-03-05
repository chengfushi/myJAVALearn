package extends_.theory;


/**
* To know extends theory
*/

public class ExtendsTheory {
    public static void main(String[] args) {

        B b = new B();
        B b1 = new B("B");
    }

}
class GrandPa{
    String name = "GrandPa";
    String hobby = "Reading";
}

class Feather extends GrandPa{
    String name = "Father";
    String hobby = "Swimming";
}

class Son extends Feather{
    String name = "Son";
    String hobby = "Running";
}

class A{
    A(){
        System.out.println("a");
    }
    A (String name){
        System.out.println("a name");
    }
}

class B extends A{
    B(){
        this("abc");
        System.out.println("b");
    }
    B (String name){
        System.out.println("b name");
    }
}