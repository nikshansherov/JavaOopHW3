package data.comparators;

import data.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    public int compare(User o1, User o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
