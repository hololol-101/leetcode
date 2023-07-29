class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>(candies.length);
        int max = 0;
        for(int c: candies){
            if(max<c){
                max = c;    
            }else{
                continue;
            }
        }
        
        for(int c:candies){
            boolean res = (c+extraCandies>=max) ? true : false;
            answer.add(res);
        }
        
        return answer;
        
    }
}