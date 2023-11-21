class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        Arrays.sort(nums);
        int size = nums.length-1;
        
        for(int i=0; i<size; ){
            if(nums[i]+nums[size]==k){
                i++;
                size--;
                answer++;
            }                
            if(nums[i]+nums[size]>k){
                size--;
            }
            if(nums[i]+nums[size]<k){
                i++;
            }
        }
        return answer;
    }
}