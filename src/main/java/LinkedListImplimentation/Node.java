package LinkedListImplimentation;

public class Node {
    Node next;
    Object data;

    Node(Object d){
        this.data = d;
        this.next = null;
    }

    Node(Object d, Node n){
        this.data = d;
        this.next = n;
    }
}
