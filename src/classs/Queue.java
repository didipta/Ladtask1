package classs;

public class Queue<T> {
    private int capacity;
    private T[] arr;
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public Queue(int queueSize){
        this.capacity = queueSize;
        this.arr=(T[]) new Object[capacity];
    }

    public void enqueue(T item) throws Exception {
        if (isQueueFull()) {
            System.out.println("Overflow state.");
        } else {
            rear++;
            if(rear == capacity-1){
                rear = 0;
            }
            arr[rear] = item;
            currentSize++;
            System.out.println("Element " + item+ " is pushed to Queue.");
        }
    }

    public void dequeue() throws Exception {
        if (isQueueEmpty()) {
            System.out.println("Underflow state.");
        } else {
            front++;
            if(front == capacity-1){
                System.out.println("Removed element: "+arr[front-1]);
                front = 0;
            } else {
                System.out.println("Removed elements: "+arr[front-1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }
}
