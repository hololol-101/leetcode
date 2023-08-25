class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int depth = 0;
        for(int i:gain){
            depth+=i;
            max = Math.max(max, depth);
        }
        return max;
    }
}