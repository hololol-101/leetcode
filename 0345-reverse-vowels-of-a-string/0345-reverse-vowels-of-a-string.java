class Solution {
    public String reverseVowels(String s) {
        int sdx = 0;
        int edx = s.length()-1;
        
        while(sdx<edx){
            boolean check = false;
            sdx = returnIdx(s, sdx, edx);
            edx = returnIdx(s, edx, sdx);
            if(sdx==-1||edx==-1){
                break;
            }

            s = s.substring(0, sdx)+s.charAt(edx)+s.substring(sdx+1, edx)+s.charAt(sdx) + s.substring(edx+1);
            sdx++;
            edx--;
        }
        return s;
    }
    int returnIdx(String s, int sdx, int edx){
        String basic = "aeiouAEIOU";

        if(sdx<edx){
            for(int i=sdx; i<edx; i++){
                if(basic.contains(""+s.charAt(i))){
                    sdx=i; 
                    return i;
                }
            }
        }else{
             for(int i=sdx; i>edx; i--){
                if(basic.contains(""+s.charAt(i))){
                    edx=i;
                    return i;
                }
            }
        }
        return -1;
    }
}