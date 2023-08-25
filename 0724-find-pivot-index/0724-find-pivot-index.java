class Solution {
    public int pivotIndex(int[] nums) {
        int n =nums.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                if(i<j) sum+=nums[j];
                else if(i>j) sum-=nums[j];
            }
            if(sum==0) return i;
        }
        return -1;
    }
}