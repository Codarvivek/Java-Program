package StringBuilder;

public class ToggleCase {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("ViVek PrataP15");
        for (int i = 0; i < str.length(); i++) {
            boolean flag=true;
            char ch=str.charAt(i);
            if(ch==' '|| (int)ch<=57)continue;
            int asci=(int)ch;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
            else{
                asci-=32;
                char dh=(char)asci;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);

        System.out.println((int)'9');
    }
}
