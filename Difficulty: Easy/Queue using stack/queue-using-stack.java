class Queue {
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    int dequeue() {
        // code here
        if(s1.isEmpty())
        {
            return -1;
        }
        return s1.pop();
    }

    void enqueue(int x) {
         //step 1 s1 --> s2 put all elem in s1 to s2
        //.. step 2 put x in st
        // .. stpe 3 put all s3 elem in s1;
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        // code here
    }
}
