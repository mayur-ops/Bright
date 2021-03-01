package StringMethod;

public class StringDemo1 {
    public static void main(String[] args) {
        char[] ch={'k','e','t','a','n'};
        String s=new String(ch);
        System.out.println(s);
    }
}

class StringDemo2{
    public static void main(String[] args) {
        String s1="Mayur";
        String s2="Patel";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.startsWith("May"));
        System.out.println(s1.endsWith("ur"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.replace("Mayur","Dipika"));
        System.out.println(s1.contains("yu"));
        System.out.println(s1.concat(s2));
    }
}