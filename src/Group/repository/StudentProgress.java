package Group.repository;


import java.util.Arrays;

import static java.lang.Math.random;

public class StudentProgress {
   private int [] marks = new int[4];

    public static int randomMark (){
        return 2 + (int)(random()*4);
    }

    public StudentProgress(int Math, int Chemistry, int Physics, int Languages){
        marks[0] = Math;
        marks[1] = Chemistry;
        marks[2] = Physics;
        marks[3] = Languages;
    }

    public int[] getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Математика: " + getMarks()[0] + "; " + "Химия: " + getMarks()[1] + "; " + "Физика: "
                + getMarks()[2] + "; " + "Языки: " + getMarks()[3];
    }
}
