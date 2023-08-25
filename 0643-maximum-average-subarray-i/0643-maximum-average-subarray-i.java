class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(i==k-1){
                max = sum;   
            }else if(i>=k){
                sum-=nums[i-k];
                max = Math.max(max, sum);
            }
        }
        return ((double)max)/k;
    }
}