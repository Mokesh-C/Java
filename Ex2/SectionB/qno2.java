package Ex2.SectionB;

public class qno2 {
    public static void main(String[] args) {
        String str = new String("123"); //This string is not store in string pool

        //Two ways to convert String to Integer
        Integer  a = Integer.parseInt(str); // using Integer.parseInt(String)
        System.out.println("Integer : "+a);
        System.out.println("String to Int : "+Integer.valueOf(str)); // using Integer.valueOf(String)

        //Int to Binary
        System.out.println("Integer to Binary : "+Integer.toBinaryString(a));

        //Int to Hexadecimal
        System.out.println("Integer to Hexadecimal : "+Integer.toHexString(a));

        //Int to Octal
        System.out.println("Integer to Octal : "+Integer.toOctalString(a));

        String s = Integer.toBinaryString(a); // s is stored in string pool
        String o = Integer.toOctalString(a);
        String h = Integer.toHexString(a);
        System.out.println("Binary String to Int : " + Integer.parseInt(s,2)); // to convert binary string to decimal, Multiply by 2
        System.out.println("Binary String to Int : " + Integer.parseInt(o,8)); // 8 for octal
        System.out.println("Binary String to Int : " + Integer.parseInt(o,16)); // 16 for hexa


        //to convert int to string
        int b = 12345;
        String s1 = new String(Integer.toString(b));
        System.out.println(s1);
        int c =10;
        int d = 111;
        System.out.println(Integer.compare(c,d));

    }
}
