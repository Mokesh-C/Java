package Ex2.SectionB;

public class qno1 {
    public static void main(String[] args) {
        //Integers
        System.out.println("Byte : "+ Byte.MIN_VALUE +" to "+ Byte.MAX_VALUE);
        System.out.println("Short : "+ Short.MIN_VALUE +" to "+ Short.MAX_VALUE);
        System.out.println("Integer : "+ Integer.MIN_VALUE +" to "+ Integer.MAX_VALUE);
        System.out.println("Long : "+ Long.MIN_VALUE +" to "+ Long.MAX_VALUE);

        //Float
        System.out.println("Float : "+ Float.MIN_VALUE +" to "+ Float.MAX_VALUE);
        System.out.println("Double : "+ Double.MIN_VALUE +" to "+ Double.MAX_VALUE);

        //char
        System.out.println("Char : "+ (int) Character.MIN_VALUE +" to "+ (int)Character.MAX_VALUE); // each char is 2 byte

        //Boolean
        System.out.println("Boolean : " + true + "or" + false);
    }
}
