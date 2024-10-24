package String;

public class FindMinimumPath {
    static float findMinimumPath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char ch=path.charAt(i);
            if(ch=='W')x--;
            else if(ch=='E')x++;
            else if(ch=='N')y++;
            else y--;
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="EWWWNSEWN";
        System.out.println(findMinimumPath(path));

    }
}
