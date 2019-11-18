package day20;

public class homework {
    public static void main(String[] args) {
        boolean status = false;
        String s = "anagram";
        String t = "nagaram";

        if (s.length() == t.length()) {
            status = true;
            System.out.println("are anagram");

        } else {
            System.out.println("not anagram");
            status = false;

        }
    }
}

    


