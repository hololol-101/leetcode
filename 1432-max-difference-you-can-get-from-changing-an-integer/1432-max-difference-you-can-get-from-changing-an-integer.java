class Solution {
    public int maxDiff(int num) {
        String nstr = Integer.toString(num);
        Character first = nstr.charAt(0);
        int max =0;
        int min =0;
            
        if(first=='9'){
            for(int i=1; i<nstr.length(); i++){
                if(nstr.charAt(i)-'9'!=0){
                    max = Integer.parseInt(nstr.replaceAll(""+nstr.charAt(i), "9"));
                    break;
                }
            }
            if(max==0) max = num;
        }else{
            max = Integer.parseInt(nstr.replaceAll(""+first, "9"));
        }
        
        
        if(first=='1'){
            for(int i=1; i<nstr.length(); i++){
                if(nstr.charAt(i)-'1'>0){
                    min = Integer.parseInt(nstr.replaceAll(""+nstr.charAt(i), "0"));
                    break;
                }
            }
            if(min==0) min = num;
        }else{
            min = Integer.parseInt(nstr.replaceAll(""+first, "1"));
        }
        return max-min;  
    }
  
}