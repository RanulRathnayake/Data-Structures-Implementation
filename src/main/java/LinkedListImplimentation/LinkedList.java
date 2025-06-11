package LinkedListImplimentation;

public class LinkedList {
    int size;
    Node head;

    LinkedList(){
        this.size = 0;
        this.head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return size;
    }

    public void addFirst(Object data){
        if(isEmpty()){
            head = new Node(data);
        }else {
            head = new Node(data,head);
        }
        size++;
    }

    public void addLast(Object data){
        if(isEmpty()){
            head = new Node(data);
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            current.next = new Node(data);
        }
        size++;
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println(head.data+"removed");
            head = head.next;
            size--;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Empty");
        }else {
            if(size==1){
                head = null;
            }else {
                Node current = head;
                while (current.next.next != null){
                    current=current.next;
                }
                System.out.println(current.next.data+" removed");
                current.next = null;
            }
            size--;
        }
    }

    public void addData(int index, Object data){
        if (0 <= index && index <= size){
            if (index==0){
                addFirst(data);
            } else {
                Node current = head;
                for (int i=0; i<index-1; i++){
                    current= current.next;
                }
                if (index == size){
                    current.next = new Node(data);
                }else {
                    current.next = new Node(data, current.next);
                }
                size++;
            }
        }else {
            System.out.println("Invalid Index");
        }
    }

    public void removeData(int index){
        if (0 <= index && index < size){
            if (index==0){
                System.out.println(head.data+" removed");
                head = head.next;
                size--;
            } else if (index==size-1) {
                if (size==1){
                    System.out.println(head.data+" removed");
                    head = null;
                }else {
                    Node current = head;
                    while (current.next.next!=null){
                        current = current.next;
                    }
                    System.out.println(current.next.data+" removed");
                    current.next = null;
                }
                size--;
            } else {
                Node current = head;
                for (int i=0;i<index-1;i++){
                    current = current.next;
                }
                System.out.println(current.next.data+" removed");
                current.next = current.next.next;
                size--;
            }
        }else {
            System.out.println("Invalid Index");
        }

    }

    public void showLinkedList(){
        if (isEmpty()){
            System.out.println("Empty");
        }else {
            System.out.println("LinkedList outputs");
            Node current = head;
            while (current!=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println("\n");
        }
    }

    public static void main(String arg[]){
        LinkedList L1 = new LinkedList();

        L1.addFirst(10);
        L1.addFirst(20);
        L1.showLinkedList();
        L1.addLast(30);
        L1.addLast(40);
        L1.showLinkedList();
        L1.removeFirst();
        L1.removeLast();
        L1.showLinkedList();
        L1.addData(0,20);
        L1.addData(2,5);
        L1.addData(4,40);
        L1.showLinkedList();
        L1.removeData(2);
        L1.removeData(0);
        L1.removeData(4);
        L1.showLinkedList();
        L1.removeData(2);
        L1.showLinkedList();
    }
}
