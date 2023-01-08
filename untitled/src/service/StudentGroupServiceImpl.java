package service;

import data.Student;
import data.StudentGroup;
import data.Teacher;

import java.util.List;

import static util.ReadFromTxt.getStudentsFromTxt;
import static util.ReadFromTxt.getTeacherFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {
    @Override
    public StudentGroup getGroup(int number) {
        return null;
    }

    @Override
    public StudentGroup getGroup() {
        Teacher teacher = getTeacherFromTxt();
        List<Student> studentList = getStudentsFromTxt();
        return new StudentGroup(teacher, studentList);
    }
}
