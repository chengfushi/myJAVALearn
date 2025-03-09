package zoo;

public class Text {
    public static void main(String[] args) {
        Dog dog = new Dog(2, "blue");
        Cat cat = new Cat(3, "white");

        Person person = new Person("Tom", 20);
        person.feed(dog, "bone");
        person.feed(cat, "fish");
    }
}
