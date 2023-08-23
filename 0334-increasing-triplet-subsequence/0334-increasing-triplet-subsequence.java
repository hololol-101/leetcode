
class Solution {
    
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length;
        int min = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        
        for(int i:nums){
          if(i<=min){
              min = i;
            }else if(i<=mid){
                mid = i;
            }else{
                return true;
            }
        }
            
        return false;
    }
}