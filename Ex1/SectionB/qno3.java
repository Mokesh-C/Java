package Ex1.SectionB;
import java.util.*;
public class qno3 {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println("String to Integer : "+ Integer.decode(s));//decode Integer value from string

        String h = "0X1A";
        System.out.println("Hexa to Integer : "+ Integer.decode(h));//decode Integer value from hexa string

        String o = "0177";
        System.out.println("Octal to Integer : "+ Integer.decode(o));//decode Integer value from Octal string

        //not possible to convert binary string to Integer using decode



    }
}
