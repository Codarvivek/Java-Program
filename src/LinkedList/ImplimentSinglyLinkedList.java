package LinkedList;

public class ImplimentSinglyLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    public static class linkedList{
        Node head;
        Node tail;
        void insertAtEnd(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void insertAtBeginning(int data){
            Node temp=new Node(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insertAt(int idx,int data){
            Node p=head;
            for (int i = 1; i <idx ; i++) {
                p=p.next;
            }
            Node temp=new Node(data);
            if(head==null){
             head=tail=temp;
            } else if (tail==null) {
                insertAtEnd(data);
            }
            else {
                temp.next = p.next;
                p.next = temp;
            }
        }
        int getAt(int idx){
            Node p=head;
            for (int i = 1; i <=idx ; i++) {
                p=p.next;
            }
            return p.data;
        }
        void Display(){
            Node Temp=head;
            while (Temp!=null){
                System.out.print(Temp.data+" ");
                Temp=Temp.next;
            }
        }
        int size(){
            Node Temp=head;
            int count=0;
            while (Temp!=null){
                count++;
                Temp=Temp.next;
            }
            return count;
        }
        void deleteAt(int idx){
            Node temp=head;
            for (int i = 1; i <idx ; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;



        }
    }

    public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.insertAtEnd(55);
        ll.insertAtEnd(86);
        ll.insertAtEnd(96);
        ll.deleteAt(1);
        ll.Display();


        System.out.println("\n"+ll.size());
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);

    }
}
