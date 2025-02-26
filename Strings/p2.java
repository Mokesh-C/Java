package Strings;

public class p2 {
    public static void main(String[] args) {
        String str = "My Malayalam friend drives racecar";
        String[] arr = str.toLowerCase().split(" ");

        int count = 0;
        for (String st : arr) {
            if (isPalindrome(st)) count++;
        }

        System.out.println("The Number of Palindrome in a Sentence is " + count );
    }

    private static boolean isPalindrome(String st) {
        int start = 0, end = st.length() - 1;
        while (start<end){
            if(st.charAt(start++) != st.charAt(end--)) return false;
        }
        return true;
    }
}
