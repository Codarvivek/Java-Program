package StringBuilder;
import java.util.*;
public class Builder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(2,'m');
        System.out.println(str);
        str.append("Everyone");
        System.out.println(str);
        str.append(true);
        System.out.println(str);
        str.insert(1,'t');
        System.out.println(str);
        str.delete(1,5);
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
}
