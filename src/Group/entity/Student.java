package Group.entity;

import Group.repository.StudentProgress;

import java.util.Objects;

public class Student {
    private String Name;
    private String Surname;
    private StudentProgress studentProgress;

    public Student (String Name, String Surname,int gradeMath, int gradeChemistry, int gradePhysics, int gradeLanguages){
        this.Name = Name;
        this.Surname = Surname;
        this.studentProgress = new StudentProgress(gradeMath,gradeChemistry,gradePhysics,gradeLanguages);

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public StudentProgress getStudentProgress() {
        return studentProgress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Surname='" + Surname + '\'' +
                ", studentProgress=" + studentProgress +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(Name, student.Name) &&
                Objects.equals(Surname, student.Surname) &&
                Objects.equals(studentProgress, student.studentProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Surname, studentProgress);
    }
}
