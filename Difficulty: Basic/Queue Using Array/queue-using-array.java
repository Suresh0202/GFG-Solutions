class MyQueue {

    int front, rear;
    int arr[] = new int[100005];
    int size=0;

    MyQueue() {
        front = 0;
        rear = -1;
        size=0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(size == arr.length)
        {
            return;
        }
        rear=(rear+1)%arr.length;
        arr[rear]=x;
        size++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(size == 0)
        {
            return -1;
        }
        int ans=arr[front];
        front=(front+1)%arr.length;
        size--;
        return ans;
        // Your code here
    }
}