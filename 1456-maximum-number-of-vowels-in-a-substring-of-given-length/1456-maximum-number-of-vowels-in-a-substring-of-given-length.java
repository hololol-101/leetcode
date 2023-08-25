class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet();
        set.add('a');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('e');

        int max = 0;
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))) cnt++;
            if(i>=k){
                if(set.contains(s.charAt(i-k))) cnt--;
            }
            max = Math.max(max, cnt);
        }
        return max;
    }
}