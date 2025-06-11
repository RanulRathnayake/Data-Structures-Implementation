public class CQueue {
    int capacity;
    int front;
    int rear;

    int CQueueArr[];

    CQueue(int size){
        front = -1;
        rear = -1;
        capacity = size;

        CQueueArr = new int[capacity];
    }

    public static void main(String[] arg){
        CQueue myCQueue = new CQueue(5);

        myCQueue.enQueue(10);
        myCQueue.enQueue(20);
        myCQueue.enQueue(30);
        myCQueue.enQueue(40);
        myCQueue.enQueue(50);
        myCQueue.showQueue();
        myCQueue.enQueue(60);
        myCQueue.deQueue();
        myCQueue.deQueue();
        myCQueue.deQueue();
        myCQueue.showQueue();
        myCQueue.enQueue(70);
        myCQueue.enQueue(80);
        myCQueue.showQueue();
        myCQueue.deQueue();
        myCQueue.deQueue();
        myCQueue.deQueue();
        myCQueue.deQueue();
        myCQueue.deQueue();

    }


    boolean isEmpty(){
        if(front == -1){
            return true;
        }else {
            return false;
        }
    }
    boolean isFull(){
        if (front==0 && rear==capacity-1){
            return true;
        } else if (front==rear+1){
            return true;
        }else {
            return false;
        }
    }
    void enQueue(int data){
        if (isFull()){
            System.out.println("The Circular Queue is full");
        }else {
            if(front==-1){
                front=0;
            }
            rear = (rear+1)%capacity;
            CQueueArr[rear] = data;
        }
    }
    void deQueue(){

        if (isEmpty()){
            System.out.println("The Circular Queue is empty");
        }
        else {
            System.out.println(CQueueArr[front]+" removed");
            if(front==rear){
                front = -1;
                rear = -1;
            }else {
                front = (front+1)%capacity;
            }
        }
    }
    void showQueue(){
        int i;
        if(isEmpty()){
            System.out.println("The Circular Queue is empty");
        }else {
            System.out.println("Output of the queue");
            for (i=front; i!=rear; i=(i+1)%capacity){
                System.out.print(CQueueArr[i]+" ");
            }
            System.out.println(CQueueArr[i]+"");
        }

    }
}
