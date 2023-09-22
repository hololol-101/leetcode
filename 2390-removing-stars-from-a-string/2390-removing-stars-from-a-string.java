class Solution {
    
    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(String s1:s.split("")){
            if(s1.compareTo("*")==0){
                stack.pop();
            }else{
                stack.push(s1);                
            }
        }
        
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}