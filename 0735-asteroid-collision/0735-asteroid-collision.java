class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i:asteroids){
            if(i<0){
                boolean check = true ;
                while(stack.size()>0 && i<0 && check){
                    check = false;
                    int p = stack.pop();
                    if(p<0){
                        stack.push(p);
                        stack.push(i);
                    }else{
                        if(Math.abs(i)<Math.abs(p)){
                            i=p;
                            check = true;
                        }else if(Math.abs(i)>Math.abs(p)){
                            check = true;
                        }else{
                            check = false;
                        }
                    }
                    
                }
                if(check) stack.push(i);
                
            }else{
                stack.push(i);
            }
        }

        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}