package Ex9.perAndSem1.Semester2;

import Ex9.perAndSem1.Header;
import Ex9.perAndSem1.Student;

public class Sem2 extends Student implements Header {
    public static final int credit3 = 3;
    public static final int credit4 = 4;
    double sub3, sub4;

    public Sem2(double x, double y){
        sub3 = x;
        sub4 = y;
    }

    public void printGrade(){
        headPrint();
        System.out.println("Student Name : " + studentName + "\t\tRoll Number : " + rollNo);
        System.out.println("Semester 2");
        System.out.println("Subject 1 : "+ sub3);
        System.out.println("Subject 2 : "+ sub4);
        System.out.printf("CGPA of this Semester %.2f\n", CGPA());
    }

    public double CGPA() {
        return (sub3 * credit3 + sub4 * credit4)/(credit3 + credit4);
    }
}
