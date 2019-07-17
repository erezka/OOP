package Group.service;

import Group.entity.Student;
import Group.repository.StudentProgress;
import Group.repository.StudentsGroup;

public class Demo implements Runable {
    public void run(){
        StudentsGroup studentsGroup = new StudentsGroup ( "Группа А",
         new Student("Алексей", "Биянов", StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark()),
         new Student("Алексей", "Кузнецов", StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark()),
         new Student("Вера", "Хитрина", StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark()),
         new Student("Лия", "Волкова", StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark()),
         new Student("Антон", "Шевчук", StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark(),StudentProgress.randomMark())
        );
        System.out.println(studentsGroup.getGroupOfStudents()[1].getStudentProgress());

    }
}
