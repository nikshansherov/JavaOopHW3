package data.comparators;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    public int compare(GroupStream o1, GroupStream o2) {
        int o11 = o1.getStudentGroup().size();
        int o22 = o2.getStudentGroup().size();
        return Integer.compare(o11, o22);
    }
}
