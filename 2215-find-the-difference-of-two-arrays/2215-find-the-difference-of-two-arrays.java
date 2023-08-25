class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new LinkedList());
        answer.add(new LinkedList());
        Set<Integer> set = new HashSet<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for(int i:nums1){
            set.add(i);    
        }
        
        for(int i=0; i<nums2.length; i++){
            if(i==0||nums2[i]!=nums2[i-1]){
                if(set.contains(nums2[i])){
                    set.remove(nums2[i]);
                }else{
                    answer.get(1).add(nums2[i]);
                }   
            }

        }
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            answer.get(0).add(it.next());
        }
        
        return answer;
    }
}