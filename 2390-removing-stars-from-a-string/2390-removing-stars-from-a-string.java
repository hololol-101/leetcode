class Solution {   
    public String removeStars(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c=='*'){
                answer=answer.substring(0, answer.length()-1);
            }else{
                answer+=c;
            }
        }
        
        return answer;
    }
}