package Ex9.perAndSem1;

public class Sem1 extends Student implements Header {
    public static final int credit1 = 2;
    public static final int credit2 = 4;
    double sub1, sub2;

    public Sem1(double x, double y){
        sub1 = x;
        sub2 = y;
    }

    public void printGrade(){
        headPrint();
        System.out.println("Student Name : " + studentName + "\t\tRoll Number : " + rollNo);
        System.out.println("Semester 1");
        System.out.println("Subject 1 : "+ sub1);
        System.out.println("Subject 2 : "+ sub2);
        System.out.printf("CGPA of this Semester %.2f\n", CGPA());
    }

    public double CGPA() {
        return (sub1* credit1 + sub2 * credit2)/(credit1+credit2);
    }
}
