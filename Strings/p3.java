    package Strings;

    public class p3 {
        public static void main(String[] args) {
            String str = "learn learn try to learn";
            String[] arr = str.toLowerCase().split(" ");
            String substr = "learn";

            int count = 0;
            for (String st : arr) {
                if (st.equals(substr)) count++;
            }

            System.out.println("The Number of Occurrence of a substring in a Sentence is " + count );
        }
    }
