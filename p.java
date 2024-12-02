import java.util.*;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linkedlist{
    Node head;
    public Linkedlist(){
        head = null;
    }
    
    public void append(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        } else {
            Node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = newnode;
        }
    }
    
    public void print(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr = curr.next;
        }
    }
    
    public void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
} 

class Main {
    public static void main(String[] args) {
        Linkedlist list =  new Linkedlist();
        list.append(40);
        list.append(20);
        list.append(30);
        list.append(50);
        list.append(100);
        list.print();
        list.reverse();
        list.print();
    }
}