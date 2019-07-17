package Group.service;

import Group.entity.Student;
import Group.repository.StudentProgress;
import Group.repository.StudentsGroup;

public class Demo implements Runable {
    public void run() {
        StudentsGroup studentsGroup = new StudentsGroup("Группа А",
                new Student("Алексей", "Биянов", StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark() ),
                new Student("Алексей", "Кузнецов",5,5,5,5 ),
                new Student("Вера", "Хитрина", StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark()),
                new Student("Лия", "Волкова", StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark()),
                new Student("Антон", "Шевчук", StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark(), StudentProgress.randomMark())
        );
        System.out.println(studentsGroup.getGroupName() + ":");
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                System.out.println("Студент " + studentsGroup.getGroupOfStudents()[i].getName() + " "
                        + studentsGroup.getGroupOfStudents()[i].getSurname() + " - "
                        + studentsGroup.getGroupOfStudents()[i].getStudentProgress().toString());
                System.out.println("Средний балл: " + StudentsSuccessRate.studentAverageSuccessRate(studentsGroup.getGroupOfStudents()[i]));
                System.out.println(" ");
            }
        }
        System.out.println("Средний балл группы: " + StudentsSuccessRate.groupAverageSuccessRate(studentsGroup));
        System.out.println("Отличников: " + StudentsSuccessRate.findExellentStudents(studentsGroup));
        System.out.println("Двоечников: " + StudentsSuccessRate.findUnsuccessfulStudents(studentsGroup));
    }
}