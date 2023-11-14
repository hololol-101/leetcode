class Solution {
    public String mergeAlternately(String word1, String word2) {
        String answer = "";
        int length = (word1.length()<word2.length()) ? word1.length():word2.length();
        
        for(int i=0 ; i<length;i++){
            answer = answer.concat(word1.charAt(i)+""+word2.charAt(i));
        }
        answer = answer.concat(word1.substring(length));
        answer = answer.concat(word2.substring(length));
        return answer;
    }
}