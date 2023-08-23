class Solution {
    public String reverseWords(String s) {
        String answer = "";

        while(s.length()>0){
            int i= s.lastIndexOf(" ");
            
            if(i<0){
                answer +=" "+ s;
                break;
            }
            else{
                answer +=" "+s.substring(i+1);
                s = s.substring(0,i).trim();                     
            }
        }
        return answer.trim();
    }
}