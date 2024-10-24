package LinkedList;

public class ImplimentLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static  void displayRec(Node head){
        if(head==null)return;

        displayRec(head.next);
        System.out.print(head.data+" ");
    }
    public static int findLength(Node head){
        int ans=0;
        while (head!=null){
           ans++;
           head=head.next;

        }
        return ans;
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(54);
        Node c=new Node(58);
        Node d=new Node(53);
        Node e=new Node(51);
        Node f=new Node(77);
        Node head=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        Node temp=a;
//        while (temp!=null){
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
        displayRec(a);
        System.out.println("\nLength="+findLength(a));

    }
}
