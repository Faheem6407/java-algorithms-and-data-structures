import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLinkedList {
    Node head;
    void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void search(int key){
        Node temp=head;
        int pos=0;
        while(temp!=null){
            if(temp.data==key){
                System.out.println("Found at position "+pos);
                return;
            }
            temp=temp.next;
            pos++;
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SinglyLinkedList list=new SinglyLinkedList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
            list.insert(sc.nextInt());
        list.display();
        int key=sc.nextInt();
        list.search(key);
    }
}
