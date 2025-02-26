package Strings;

public class p1 {
    public static void main(String[] args) {
        String str = "Hello Everyone!";
        String s = str.toLowerCase();

        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') freq[ch-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                char ch = (char) ('a' + i);
                System.out.println(ch + " : " + freq[i]);
            }
        }
    }
}
