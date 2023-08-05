class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int size = flowerbed.length;
        
        if(n==0){
            return true;
        }else if(size<2){
            if(flowerbed[0]==0){
                return true;
            }else{
                return false;
            }
        }
        
        if(flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        
        if(flowerbed[size-1]==0&&flowerbed[size-2]==0){
            flowerbed[size-1]=1;
            n--;
        }

        for(int i=1; i<size-1; i++){
            if(flowerbed[i]+flowerbed[i-1]+flowerbed[i+1]==0){
                flowerbed[i]=1;
                n--;
            }
            
        }
        return (n<=0)?true:false;
    }
}