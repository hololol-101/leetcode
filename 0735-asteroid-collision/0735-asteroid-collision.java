class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int i:asteroids){
            stack.push(i);
            if(i<0){
                while(stack.size()>1 && i<0 ){
                    i = stack.pop();
                    int p = stack.pop();
                    if(p<0){
                        stack.push(p);
                        stack.push(i);
                        break;
                    }else{
                        if(Math.abs(i)==Math.abs(p)){
                            break;
                        }else{
                            i = (Math.abs(i)>Math.abs(p))?i:p;
                            stack.push(i);
                        }
                    }
                }
            }
        }

        int[] answer = new int[stack.size()];
        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}