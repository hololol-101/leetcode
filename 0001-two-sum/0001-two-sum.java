class Solution {
    public int[] twoSum(int[] nums, int target) {

        /*
        int[] answer = new int[2];

        for(int i=0; i<nums.length-1; i++){
            int sub = target - nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==sub){
                    answer[0]=i;
                    answer[1]=j;
                    return answer;
                }
            }
        }
        */
        //Solution
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        int i=0;
        while(i<nums.length){
            int index = map.getOrDefault(target-nums[i], -1);
            if(index==-1){
                map.put(nums[i], i++);
            }else{
                answer[0]=index;
                answer[1]=i;
                return answer;
            }
        }
   
        return answer;
    }
}