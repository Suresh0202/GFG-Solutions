/*Complete the function below*/

class Solution {
    // Function to find three numbers such that arr[smaller[i]] < arr[i] <
    // arr[greater[i]]
    public List<Integer> find3Numbers(int[] arr) {
        // code here
           List<Integer> l=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]<arr[j] && arr[i]<arr[k] && arr[j]<arr[k]){
                        l.add(arr[i]);
                        l.add(arr[j]);
                        l.add(arr[k]); return l;
                    }
                    
                }
            }
        }
        return l;
    }
}