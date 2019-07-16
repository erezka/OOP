package Group.repository;

import Group.entity.Student;

import java.util.Arrays;
import java.util.Objects;

public class StudentsGroup {
    private String groupName;
    private Student[] groupOfStudents = new Student[5];

    public StudentsGroup(String groupName, Student studentFirst, Student studentSecond, Student studentThird,
                         Student studentFourth, Student studentFifth) {
        this.groupName = groupName;
        this.groupOfStudents[0] = studentFirst;
        this.groupOfStudents[1] = studentSecond;
        this.groupOfStudents[2] = studentThird;
        this.groupOfStudents[3] = studentFourth;
        this.groupOfStudents[4] = studentFifth;
    }

    public String getGroupName() {
        return groupName;
    }

    public Student[] getGroupOfStudents() {
        return groupOfStudents;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupOfStudents=" + Arrays.toString(groupOfStudents) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentsGroup that = (StudentsGroup) o;
        return Objects.equals(groupName, that.groupName) &&
                Arrays.equals(groupOfStudents, that.groupOfStudents);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(groupName);
        result = 31 * result + Arrays.hashCode(groupOfStudents);
        return result;
    }
}
