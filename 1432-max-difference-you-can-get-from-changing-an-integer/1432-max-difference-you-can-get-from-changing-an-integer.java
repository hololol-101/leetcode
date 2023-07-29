class Solution {
    public int maxDiff(int num) {
        String nstr = Integer.toString(num);
        int result = 0;
        
        if(nstr.charAt(0)=='9'){
            String str = nstr.replaceAll("[9]", "");
            if(str.length()==0) result = num;
            else result = Integer.parseInt(nstr.replaceAll(""+str.charAt(0), "9"));
        }else{
            result = Integer.parseInt(nstr.replaceAll(""+nstr.charAt(0), "9"));   
        }
        if(nstr.charAt(0)=='1'){
            String str = nstr.replaceAll("[1,0]", "");
            if(str.length() == 0) result -= num;
            else result -= Integer.parseInt(nstr.replaceAll(""+str.charAt(0), "0"));
        }else{
            result -= Integer.parseInt(nstr.replaceAll(""+nstr.charAt(0), "1"));   
        }
        
        return result;  
    }
  
}