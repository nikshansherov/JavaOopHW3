package data;

public class Student extends User {
    private int numberGroup;

    public Student(String fio, int age, int passport, int numberGroup) {
        super(fio, age, passport);
        this.numberGroup = numberGroup;
    }
}
