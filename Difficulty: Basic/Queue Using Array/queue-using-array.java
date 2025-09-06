class MyQueue {

    int front, rear;
    int arr[] = new int[100005];
    int curr;
    MyQueue() {
        front = -1;
        rear = -1;
        curr=0;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        if(curr >=arr.length){
            return;
        }
        if(curr == 0)
        {
            front = 0;
            rear =0;
        }else
        {
            rear=(rear+1)%arr.length;
        }
        arr[rear]=x;
        curr++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(curr == 0)
        {
            return -1;
        }
        int ele=arr[front];
        if(curr == 1)
        {
            front=-1;
            rear = -1;
        }else
        {
            front = (front+1)%arr.length;
        }
        curr--;
        return ele;
        // Your code here
    }
}