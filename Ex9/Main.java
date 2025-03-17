package Ex9;

import Ex9.perAndSem1.Sem1;
import Ex9.perAndSem1.Semester2.Sem2;

public class Main {
    public static void main(String[] args) {
        Sem1 s1 = new Sem1(8, 7.5);
        s1.set("24MXian", "24MX217");
        s1.printGrade();

        Sem2 s2 = new Sem2(9, 8.5);
        s2.set("24MXian", "24MX217");
        s2.printGrade();

        double overAllCGPA = ((s1.CGPA() / (s1.credit1 + s1.credit2)) + (s2.CGPA() * (s2.credit3 + s2.credit4))) / (s1.credit1 + s1.credit2 + s2.credit3 + s2.credit4);
        System.out.printf("OverAll CGPA : %.2f",overAllCGPA);
    }
}
