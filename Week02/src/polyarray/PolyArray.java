package polyarray;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        persons[0] = new Person("Tom", 21);
        persons[1] = new Student("jack", 21,100);
        persons[2] = new Student("emmi", 21,20);
        persons[3] = new Teacher("scoot", 21,3000);
        persons[4] = new Teacher("king", 21,250000);

        for (int i = 0; i < persons.length; i++) {
            persons[i].say();
        }
    }
}
