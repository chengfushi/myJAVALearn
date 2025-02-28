package day05;

public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int result = p1.getSum(1,2);
        System.out.println(result);
    }

}

class Person {

    public int getSum(int a,int b){
        return  a + b;
    }
}
