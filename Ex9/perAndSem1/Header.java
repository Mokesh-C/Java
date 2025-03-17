package Ex9.perAndSem1;

public interface Header {
    default void headPrint(){
        System.out.println("\n\t\tPSG College of Technology");
        System.out.println("\t\tMCA Degree Programme");
        System.out.println("\t\tMark Statement\t\tAcademic year 2024 - 2025\n");
    }
    void printGrade();
}
