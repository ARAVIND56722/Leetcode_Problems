// Last updated: 15/9/2026, 12:16:46 pm
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue <Integer> que=new LinkedList<>();
4        for(int i=0;i<tickets.length;i++){
5            que.offer(i);
6        }
7        int time=0;
8        
9        while(tickets[k]!=0){
10            int n=que.remove();
11            tickets[n]--;
12            time++;
13            if(tickets[n]>0){
14                que.offer(n);
15            }
16            
17        }
18        return time;
19
20    }
21}