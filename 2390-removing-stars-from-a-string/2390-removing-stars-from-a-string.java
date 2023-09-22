class Solution {
    Stack<Character> stack = new Stack<>();
    
    public String removeStars(String s) {
        String answer="";   
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='*'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        while(stack.size()>0){
            answer=stack.pop()+answer;
        }
        return answer;
    }
}