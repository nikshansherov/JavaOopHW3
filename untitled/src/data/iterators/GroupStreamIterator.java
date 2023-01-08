package data.iterators;

import data.GroupStream;
import data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private int cursor;
    private final GroupStream groundStream;
    private final List<StudentGroup> studentGroups;

    public GroupStreamIterator(GroupStream groundStream) {
        this.groundStream = groundStream;
        this.studentGroups = groundStream.getStudentGroup();
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroups.size();
    }

    public StudentGroup next() {
        return studentGroups.get(cursor++);
    }


}
