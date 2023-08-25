class Solution {
    public int maxVowels(String s, int k) {
        s = s.replaceAll("[a,e,o,u]", "i");
        int max = 0;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='i') cnt++;
            if(i>=k){
                if(s.charAt(i-k)=='i') cnt--;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}