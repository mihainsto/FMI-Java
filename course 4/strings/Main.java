package strings;

public class Main {
    static String membruClasa;

    public static void main(String[] args) {
        System.out.println(membruClasa);

        String s1 = "";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = "abc";
        System.out.println(s2 == s3);
        System.out.println(s4 == s3);
    }
}
