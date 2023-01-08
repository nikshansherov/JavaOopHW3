package data;

import data.iterators.GroundStreamIterator;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroup;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public Iterator<StudentGroup> iterator() {
        return new GroundStreamIterator(this);
    }
}
