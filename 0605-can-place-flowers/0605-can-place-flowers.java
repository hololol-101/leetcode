class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        String str = "0";
        for(int i:flowerbed){
            str+=i;
        }
        str+="0";
        
        String[]arr = str.split("1");
        
        for(String s: arr){
            int leng = s.length();
            
            if(leng%2==0 && leng!=0){
                n-=leng/2-1;
            }else{
                n-=leng/2;
            }
            
            if(n<=0){
                return true;
            }
        }
        return false;
    }
}