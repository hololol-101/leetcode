class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int zeroCnt = 0;
        for(int i:nums){
           if(i!=0){
               mul*=i;
           } else{
               zeroCnt++;
           }
        }
        
        //Zero 수가 2개 이상일 경우 모든 결과값은 0
        if(zeroCnt>1){
            mul=0;
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[i] = mul;
            }else{
                nums[i] = (zeroCnt>0)?0:mul/nums[i];
            }
        }
        return nums;
        
    }
}