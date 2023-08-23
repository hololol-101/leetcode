class Solution {
    public String reverseWords(String s) {
        String answer = "";
        for(String subs:s.split(" ")){
            if(subs.length()>0){
                answer =subs+" " +answer ;
            }
        }
        return answer.trim();
    }
}