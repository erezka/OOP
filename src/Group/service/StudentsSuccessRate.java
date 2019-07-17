package Group.service;

import Group.entity.Student;
import Group.repository.StudentsGroup;

public class StudentsSuccessRate implements SuccessCalculatable {

    public double studentAverageSuccessRate(Student student) {
        double marksSumm = 0;
        for (int i = 0; i < student.getStudentProgress().getMarks().length; i++) {
            marksSumm += student.getStudentProgress().getMarks()[i];

        }
        return marksSumm / student.getStudentProgress().getMarks().length;
    }


    public void findExellentStudents(StudentsGroup studentsGroup) {
        int countExellentMarks = 0;
        int countExellentStudents = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                for (int j : studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()) {
                    if (studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()[j] == 5) {
                        countExellentMarks++;
                    }

                }

            } else if (countExellentMarks == studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks().length) {
                countExellentStudents++;

            }

        }
        System.out.println("Количество отличников в группе " + studentsGroup.getGroupName() + ": " + countExellentStudents);

    }

    public void findUnsuccessfulStudents(StudentsGroup studentsGroup) {
        int countUnsuccessfulMarks = 0;
        int countUnsuccessfulStudents = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                for (int j : studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()) {
                    if (studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()[j] == 2) {
                        countUnsuccessfulMarks++;
                    }

                }

            } else if (countUnsuccessfulMarks > 0) {
                countUnsuccessfulStudents++;

            }

        }
        System.out.println("Количество двоечников в группе " + studentsGroup.getGroupName() + ": " + countUnsuccessfulStudents);

    }

    public void groupAverageSuccessRate(StudentsGroup studentsGroup) {
        double groupAverageMark = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                groupAverageMark += studentAverageSuccessRate(studentsGroup.getGroupOfStudents()[i]);

            }

        }
        System.out.println("Средняя оценка по группе " + studentsGroup.getGroupName() + ": " + groupAverageMark/studentsGroup.getGroupOfStudents().length);

    }

}
