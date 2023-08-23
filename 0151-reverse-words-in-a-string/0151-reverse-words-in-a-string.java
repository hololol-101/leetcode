class Solution {
    public String reverseWords(String s) {
        String answer = "";

        for(String sub:s.split(" +")){
            answer = sub + " " + answer;
        }
        return answer.trim();
    }
}