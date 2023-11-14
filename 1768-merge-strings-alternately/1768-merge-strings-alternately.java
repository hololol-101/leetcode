class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
    
        int length = (word1.length()<word2.length()) ? word1.length():word2.length();
        
        for(int i=0 ; i<length;i++){
            st.append(word1.charAt(i));
            st.append(word2.charAt(i));
        }
        st.append(word1.substring(length));
        st.append(word2.substring(length));
        return st.toString();
    }
}