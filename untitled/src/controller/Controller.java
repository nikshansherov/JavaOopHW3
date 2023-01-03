package controller;

import data.Student;
import data.StudentGroup;
import service.DataGroupService;
import service.DataService;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

public class Controller {
    private DataService studentService;
    private DataGroupService groupService;
    private StudentGroup groupNumber;

    public Controller(StudentServiceImpl studentService, StudentGroupServiceImpl groupService, StudentGroup groupNumber) {
        this.studentService = studentService;
        this.groupService = groupService;
        this.groupNumber = groupNumber;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(StudentGroupServiceImpl groupNumber) {
        return groupService.readGroup((StudentGroup) groupService);
    }
}
