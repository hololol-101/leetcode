class Solution {
    public int maxOperations(int[] nums, int k) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        Iterator<Integer> it =  hm.keySet().iterator();
        while(it.hasNext()){
            int n = it.next();
            if(n*2==k){
                answer += hm.get(n)/2;
                hm.put(n, 0);
            }
            if(hm.getOrDefault(n, 0)*hm.getOrDefault(k-n,0)!=0){   
                answer += Math.min(hm.get(n), hm.get(k-n));
                hm.put(n,0);
                hm.put(k-n,0);
            }

        }
        return answer;
    }
}