class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new LinkedList());
        answer.add(new LinkedList());
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i:nums1){
            set.add(i);    
        }

        for(int i:nums2){
            set2.add(i);    
        }

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int n = it.next();
            if(!set2.contains(n)){
                answer.get(0).add(n);
            }
        }
        
        it = set2.iterator();
        while(it.hasNext()){
            int n = it.next();
            if(!set.contains(n)){
                answer.get(1).add(n);
            }
        }
        return answer;
    }
}