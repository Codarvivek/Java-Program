package String;

public class StringTest {
    public static void main(String[] args) {
        String str="kello";
        String gtr="iello";
        System.out.println(str.indexOf('l'));
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("ello"));
        System.out.println(gtr.startsWith("ie"));
        System.out.println(gtr.toUpperCase());

    }
}
