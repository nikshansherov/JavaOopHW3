package data;

public class Teacher extends User {
    private String department;

    public Teacher(String fio, int age, int passport, String department) {
        super(fio, age, passport);
        this.department = department;
    }
}
