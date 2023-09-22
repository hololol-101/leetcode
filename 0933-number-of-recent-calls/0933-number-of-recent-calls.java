class RecentCounter {
    Queue<Integer> queue = new LinkedList<>();
    int cnt = 0;
    int st = 0;
    public RecentCounter() {
    }
    
    public int ping(int t) {
        queue.offer(t);
        while(queue.peek()+3000<t){
            queue.poll();
        }
    
        return queue.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */