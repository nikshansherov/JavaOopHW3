package data;

public class Teacher extends User {
    private String rank;

    public Teacher(String firstName, String lastName, int id, String rank) {
        super(firstName, lastName, id);
        this.rank = rank;
    }
}
