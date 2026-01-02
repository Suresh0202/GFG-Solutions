class Solution {
    public void sort012(int[] arr) {
        int count=0,count1=0,count2=0;
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==0){
               count++;
           }else if(arr[i]==1)
           {
               count1++;
           }else{
               count2++;
           }
       }
       int i=0;
       while(count -->0)
       {
           arr[i++]=0;
       }
        while(count1 -->0)
       {
           arr[i++]=1;
       }
       
        while(count2 -->0)
       {
           arr[i++]=2;
       }
      
    }
}