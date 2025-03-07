package polyarray;


public class Student extends Person {
    private double score;

    public Student(double score) {
        this.score = score;
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void say(){
        System.out.println("I am a student.");
    }
}
