class Solution {
    public boolean hasTripletSum(int nums[], int target) {
        // code Here
         int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<target)j++;
                else if(sum>target)k--;
                else return true;
            }
        }
        return false;
        
    }
}
