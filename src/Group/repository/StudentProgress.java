package Group.repository;


import static java.lang.Math.random;

public class StudentProgress {
    private int Math =  2 + (int)(random()*4);
    private int Chemistry = 2 + (int)(random()*4);
    private int Physics = 2 + (int)(random()*4);
    private int Languages = 2 + (int)(random()*4);
    private int [] marks = new int[4];

    public StudentProgress(){
        marks[0] = Math;
        marks[1] = Chemistry;
        marks[2] = Physics;
        marks[3] = Languages;
    }

    public int[] getMarks() {
        return marks;
    }
}
