package service;

import data.StudentGroup;
import util.ReadToTxt;

public class StudentGroupServiceImpl implements DataGroupService {
    @Override
    public StudentGroup readGroup(StudentGroup studentGroup) {
        return ReadToTxt.readGroup(studentGroup);
    }
}
