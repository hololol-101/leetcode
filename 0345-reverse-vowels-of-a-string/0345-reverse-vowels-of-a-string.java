class Solution {
    public String reverseVowels(String s) {
        int sdx = 0;
        int edx = s.length()-1;
        String basic = "aeiouAEIOU";
        while(sdx<edx){
            boolean check = false;
            for(int i=sdx; i<edx; i++){
                if(basic.contains(""+s.charAt(i))){
                    sdx=i; 
                    check = true;
                    break;
                }
            }
            if(!check){
                break;
            }
            check = false;
            for(int i=edx; i>sdx; i--){
                if(basic.contains(""+s.charAt(i))){
                    edx=i;
                    check=true;
                    break;
                }
            }
            if(!check){
                break;
            }

            s = s.substring(0, sdx)+s.charAt(edx)+s.substring(sdx+1, edx)+s.charAt(sdx) + s.substring(edx+1);
            sdx++;
            edx--;
        }
        return s;
    }
}