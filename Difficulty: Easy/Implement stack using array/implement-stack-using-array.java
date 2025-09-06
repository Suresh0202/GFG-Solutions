class MyStack {
    int top=-1;
    int arr[]=new int[100];
    public void push(int x) {
        // code here
        if(top >= 100)
        {
            return ;
        }
       
        top++;
        arr[top]=x;
        
        
    }

    public int pop() {
        if(top == -1)
        {
            return -1;
        }
        int ele=arr[top];
        top--;
        return ele;
        // code here
    }
}
