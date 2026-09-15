// Last updated: 15/9/2026, 6:24:11 am
1class RecentCounter {
2    Queue <Integer> que = new LinkedList<>();
3    public RecentCounter() {
4    
5    }
6    
7    public int ping(int t) {
8        que.offer(t);
9        int min=t-3000;
10        while(que.peek()<min){
11            que.remove();
12        }
13        return que.size();
14    }
15}
16
17/**
18 * Your RecentCounter object will be instantiated and called as such:
19 * RecentCounter obj = new RecentCounter();
20 * int param_1 = obj.ping(t);
21 */