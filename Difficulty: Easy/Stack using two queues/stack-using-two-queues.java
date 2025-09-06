class Queues {
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
        // code here
        int size=q1.size();
        q1.add(a);
        for(int i=1;i<=size;i++)
        {
            q1.add(q1.poll());
        }
    }

    int pop() {
        if(q1.size() == 0)
        {
            return -1;
        }
        return q1.poll();
        // code here
    }
}