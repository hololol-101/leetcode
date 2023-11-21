class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        Arrays.sort(nums);
        int left = 0; 
        int right = nums.length-1;
        
        while(left<right){
            if(nums[left]+nums[right]==k){
                left++;
                right--;
                answer++;
            }                
            if(nums[left]+nums[right]>k){
                right--;
            }
            if(nums[left]+nums[right]<k){
                left++;
            }
        }
        return answer;
    }
}