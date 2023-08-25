class Solution {
    public int maxVowels(String s, int k) {
        Map<Character, Integer> set = new HashMap();
        set.put('a',1);
        set.put('i',1);
        set.put('o',1);
        set.put('u',1);
        set.put('e',1);

        int cnt = 0;
        for(int i=0; i<k; i++){
            cnt += set.getOrDefault(s.charAt(i), 0) ;
        }
        
        int max = cnt;        
        for(int i=k; i<s.length(); i++){
            cnt += set.getOrDefault(s.charAt(i), 0) - set.getOrDefault(s.charAt(i-k), 0);
            
            max = Math.max(max, cnt);
            if(max==k) return k;
        }
        return max;
    }
}