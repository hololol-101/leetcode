class Solution {
    
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='*'){
                stack.pop();
            }else{
                stack.push(c);                
            }
        }
        
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}