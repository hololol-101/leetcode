class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i:asteroids){
            stack.push(i);
            if(stack.size()>1){
                int s1 = stack.pop();
                int s2 = stack.pop();
                while(s1<0 && s2>0){
                    if(Math.abs(s1)==Math.abs(s2)){
                        if(stack.size()>=2){
                            s1 = stack.pop();
                            s2 = stack.pop();
                        }else{
                            s2 = 0;
                            s1 = 0;
                            break;
                        }
                    }else{                    
                        s1 = (Math.abs(s1)<Math.abs(s2))?s2:s1;
                       if(stack.size()>0){
                            s2=stack.pop();
                        }else{
                           s2 = 0;
                            break;
                        }
                    }
                }
                if(s2!=0) stack.push(s2);
                if(s1!=0) stack.push(s1);
            }
        }

        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}