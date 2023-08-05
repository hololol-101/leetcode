class Solution {
    public boolean isSubsequence(String s, String t) {
        int sidx =0;
        if(s.length()==0)return true;
        
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)==s.charAt(sidx)){
                sidx++;
                if(sidx==s.length())
                    return true;
            }
        }
        return false;
    }
}