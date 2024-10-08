class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            List<Integer> col = new ArrayList<>(i+1);
            answer.add(col);
        }
        
        
        for(int i=0; i<numRows; i++){            
            List col = answer.get(i);
            for(int j=0; j<=i; j++){
                if(j==0 ||j==i){
                    col.add(1);
                }else{
                    col.add(answer.get(i-1).get(j-1)+answer.get(i-1).get(j));
                }
            }
        }
        
        return answer;
    }
}