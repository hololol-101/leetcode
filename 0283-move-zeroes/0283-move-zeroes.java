class Solution {
    public void moveZeroes(int[] nums) {
        int nidx = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0 && i!=nidx){
                nums[nidx++] = nums[i];
                nums[i]=0;
            }else if(nums[i]!=0){
                nidx++;
            }
        }
    }
}