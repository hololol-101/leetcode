class Solution {
    public int compress(char[] chars) {
        String s = "";
        char base = chars[0];
        int cnt =0;
        
        for(char c:chars){
            if(c==base){
                cnt++;
            }
            else{
                s+=base;
                if(cnt>1){
                    s+=cnt;
                }
                base=c;
                cnt=1;
            }
        }
        
        s +=base;
        if(cnt>1){
            s +=cnt;           
        }
        
        for(int i=0; i<s.length(); i++){
            chars[i]=s.charAt(i);
            
        }
        return s.length();
    }
}