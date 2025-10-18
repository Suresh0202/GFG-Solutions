class Solution {
    public void printNos(int n) {
        // Code here
        func(1,n);
    }
    public void func(int i,int n)
    {
        if(i == n+1)return;
        System.out.print(i+" ");
        func(i+1,n);
    }
    
}
