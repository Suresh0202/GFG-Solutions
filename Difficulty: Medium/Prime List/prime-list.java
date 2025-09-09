// User function Template for Java
/*
class Node{
    Node next;
    int val;
    public Node(int data){
        val=data;
        next=null;
    }
}
*/

class Solution {
    
    static int arr[] = new int[(int)(1e5+1)];
    
    public boolean isPrime(int n) {
        if (arr[n] == -1) {
            return false;
        }
        return true;
    }

    // find nearest prime on right side
    public int[] findfront(int data) {
        int cnt = 0;
        for (int i = data; i < arr.length; i++) {
            if (arr[i] == -1) {
                cnt++;
            } else {
                return new int[]{i, cnt}; // prime, distance
            }
        }
        return new int[]{-1, Integer.MAX_VALUE};
    }

    // find nearest prime on left side
    public int[] findback(int data) {
        int cnt = 0;
        for (int i = data; i >= 2; i--) {
            if (arr[i] == -1) {
                cnt++;
            } else {
                return new int[]{i, cnt}; // prime, distance
            }
        }
        return new int[]{-1, Integer.MAX_VALUE};
    }
    
    Node primeList(Node head) {
        // sieve initialization
        arr[0] = -1;
        arr[1] = -1;
        for (int i = 2; i * i < arr.length; i++) {
            if (arr[i] != -1) {
                for (int j = i + i; j < arr.length; j += i) {
                    arr[j] = -1;
                }
            }
        }

        Node temp = head;
        while (temp != null) {
            int data = temp.val;
            if (!isPrime(data)) {
                int[] front = findfront(data);
                int[] back = findback(data);

                int primeFront = front[0];
                int distFront = front[1];

                int primeBack = back[0];
                int distBack = back[1];

                // choose nearest prime
                if (distFront < distBack) {
                    temp.val = primeFront;
                } else if (distBack < distFront) {
                    temp.val = primeBack;
                } else {
                    // if equal distance, choose smaller prime
                    temp.val = Math.min(primeFront, primeBack);
                }
            }
            temp = temp.next;
        }
        return head;
    }
}
