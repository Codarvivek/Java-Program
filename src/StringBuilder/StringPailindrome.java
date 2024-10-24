package StringBuilder;

public class StringPailindrome {
    public static void main(String[] args) {
        String str="appar";
        StringBuilder gtr=new StringBuilder(str);
        int i=0;
        int j=gtr.length()-1;
        boolean flag=true;
        while(i<j){
            if(gtr.charAt(i)!=gtr.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
        if(flag) System.out.print("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
