package Group.service;

import Group.entity.Student;
import Group.repository.StudentsGroup;

public class StudentsSuccessRate {

    public static double studentAverageSuccessRate(Student student) {
        double marksSumm = 0;
        for (int i = 0; i < student.getStudentProgress().getMarks().length; i++) {
            marksSumm += student.getStudentProgress().getMarks()[i];

        }
        return marksSumm / student.getStudentProgress().getMarks().length;
    }


    public static int findExellentStudents(StudentsGroup studentsGroup) {
        int countExellentStudents = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            int countExellentMarks = 0;
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                for (int j = 0; j <studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks().length ; j++) {
                    if (studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()[j] == 5) {
                        countExellentMarks++;
                    }
                }
            }
            if (countExellentMarks == studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks().length) {
                countExellentStudents++;
            }
        }
        return countExellentStudents;
    }

    public static int findUnsuccessfulStudents(StudentsGroup studentsGroup) {
        int countUnsuccessfulStudents = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            int countUnsuccessfulMarks = 0;
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                for (int j = 0; j <studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks().length ; j++) {
                    if (studentsGroup.getGroupOfStudents()[i].getStudentProgress().getMarks()[j] == 2) {
                        countUnsuccessfulMarks++;
                    }
                }
            }
            if (countUnsuccessfulMarks > 0) {
                countUnsuccessfulStudents++;
            }

        }
        return countUnsuccessfulStudents;

    }

    public static double groupAverageSuccessRate(StudentsGroup studentsGroup) {
        double groupAverageMark = 0;
        for (int i = 0; i < studentsGroup.getGroupOfStudents().length; i++) {
            if (studentsGroup.getGroupOfStudents()[i] != null) {
                groupAverageMark += studentAverageSuccessRate(studentsGroup.getGroupOfStudents()[i]);

            }

        }
        return groupAverageMark/studentsGroup.getGroupOfStudents().length;

    }

}
