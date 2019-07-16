package Group.service;

import Group.entity.Student;
import Group.repository.StudentsGroup;

public interface SuccessCabculatable {
    double studentAverageSuccessRate(Student student);
    void findExellentStudents(StudentsGroup group);
    void findUnsuccessfulStudents(StudentsGroup group);
    void groupAverageSuccessRate(StudentsGroup group);
}
