class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for(int i=0; i<word1.length(); i++){
            
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);
        }

        if(map1.size()!=map2.size()){
            return false;
        }
                
        Iterator<Character> it = map2.keySet().iterator();
        while(it.hasNext()){
            if(map1.getOrDefault(it.next(), -1)<0){
                return false;
            }
        }
        
        List<Integer> al = new LinkedList<>( map1.values());
        List<Integer> al2 = new LinkedList<>( map2.values());
        Collections.sort(al);
        Collections.sort(al2);
        
        for(int i=0; i<al.size(); i++){
          System.out.println(al.get(i));
          System.out.println(al2.get(i));
            if(al.get(i)<al2.get(i)||al.get(i)>al2.get(i)){
              return false;
            }
        }
        return true;
    }
}