package data;

import java.util.ArrayList;

public class StudentGroup {
    private int groupNumber;
    private String teacher;
    private ArrayList listStudent = new ArrayList<>();

    public StudentGroup(int groupNumber, String teacher, ArrayList listStudent) {
        this.groupNumber = groupNumber;
        this.teacher = teacher;
        this.listStudent = listStudent;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList getListStudent() {
        return listStudent;
    }

    public void setListStudent(ArrayList listStudent) {
        this.listStudent = listStudent;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
