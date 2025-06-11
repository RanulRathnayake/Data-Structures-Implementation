public class QueueImp {
    int front;
    int rear;
    int capacity;
    int noItem;

    int queueArr[];

    QueueImp(int size){
        capacity = size;
        front = 0;
        rear = -1;

        queueArr = new int[size];
    }

    public static void main(String[] arg){
        QueueImp myQueue = new QueueImp(5);

        myQueue.enQueue(10);
        myQueue.enQueue(20);
        myQueue.enQueue(30);
        myQueue.enQueue(40);
        myQueue.enQueue(50);
        myQueue.showQueue();
        myQueue.enQueue(60);
        myQueue.deQueue();
        myQueue.showQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.showQueue();
        myQueue.deQueue();
    }

    boolean isFull(){
        return rear+1 == capacity;
    }
    boolean isEmpty(){
        return front>rear;
    }
    void showQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }else {
            System.out.println("Output of the queue");
            for (int i=front; i<=rear; i++){
                System.out.print(queueArr[i]+" ");
            }
            System.out.println("");
        }

    }
    void enQueue(int x){
        if(isFull()){
            System.out.println("The Queue is full");
        }else {
            rear++;
            queueArr[rear] = x;
            System.out.println(x+" inserted");
        }
    }

    void deQueue(){
        if (isEmpty()){
            System.out.println("The Queue is empty");
        }else {
            System.out.println(queueArr[front]+"removed");
            front++;
        }
    }




}
