class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length; i++){
            int index = map.getOrDefault(target-nums[i], -1);
            if(index !=-1 && i!=index){
                answer[0] = i;
                answer[1] = index;
                return answer;
            }
            
        }
        return answer;
    }
}