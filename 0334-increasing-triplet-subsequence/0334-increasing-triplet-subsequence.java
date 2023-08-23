
class Solution {
    
    public boolean increasingTriplet(int[] nums) {
        int size = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<size; i++){
            if(hm.get(nums[i])==null){
                hm.put(nums[i], null);
            }
            
            Iterator<Integer>it = hm.keySet().iterator();
                
            while(it.hasNext()){
                int key = it.next();
                if(key<nums[i]){
                    if(hm.get(key)==null || hm.get(key)>nums[i]){
                        hm.put(key, nums[i]);
                    }else if(hm.get(key)<nums[i]){
                        return true;
                    }                    
                }

            }
                
        
        }
        
            
        return false;
    }
}