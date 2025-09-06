/*
class QueueNode
{
    int data;
    QueueNode next;
    QueueNode(int a)
    {
        data = a;
        next = null;
    }
}
*/

class MyQueue {
    QueueNode front, rear;
    
    // Function to push an element into the queue.
    void push(int a) {
        // code here
        QueueNode temp=new QueueNode(a);
        if(front == null && rear == null)
        {
            front=temp;
            rear= temp;
        }else
        {
            rear.next=temp;
            rear =rear.next;
        }
    }

    // Function to pop front element from the queue
   int pop() {
        if (front == null) {
            return -1; // queue empty
        }
        int ans = front.data;
        front = front.next;  // move front forward
        if (front == null) { // if queue became empty
            rear = null;
        }
        return ans;
    }
}