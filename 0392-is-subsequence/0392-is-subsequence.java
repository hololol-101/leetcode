class Solution {
    public boolean isSubsequence(String s, String t) {
        int sidx =0;
        
        for(int i=0; i<t.length(); i++){
            if(sidx==s.length()){
                break;             
            }
            
            if(t.charAt(i)==s.charAt(sidx)){
                sidx++;
            }
        }
        return sidx==s.length()? true: false;
    }
}