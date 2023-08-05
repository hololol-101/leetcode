class Solution {
    public boolean isSubsequence(String s, String t) {
        int sidx =0;
        while(sidx<s.length()){
            int tidx = t.indexOf(s.charAt(sidx));
            
            if(tidx<0) return false;
            
            t=t.substring(tidx+1);
            sidx++;
        }
        return true;
    }
}