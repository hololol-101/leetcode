class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int size = cost.length;
        
        for(int i=2; i<size; i++){
            cost[i]+=Math.min(cost[i-2], cost[i-1]);
        }
        
        return Math.min(cost[size-1], cost[size-2]);
    }   
}