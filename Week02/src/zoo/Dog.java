package zoo;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("color is " + getColor() + " Dog is eating " + something);
    }

    public void lookHome() {
        System.out.println("狗看家");
    }

}
