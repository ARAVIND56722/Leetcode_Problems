// Last updated: 8/9/2026, 12:20:23 pm
1class MyStack {
2     Queue <Integer> que=new LinkedList<>();
3
4    public MyStack() {
5        
6
7    }
8    
9    public void push(int x) {
10        que.add(x);
11        int n = que.size(); 
12        for(int i = 0; i < n - 1; i++) {
13             que.add(que.remove());
14        }
15    }
16    
17    public int pop() {
18       return que.remove();  
19    }
20    
21    public int top() {
22        return que.peek();
23    }
24    
25    public boolean empty() {
26        return que.isEmpty();
27        
28    }
29}
30
31/**
32 * Your MyStack object will be instantiated and called as such:
33 * MyStack obj = new MyStack();
34 * obj.push(x);
35 * int param_2 = obj.pop();
36 * int param_3 = obj.top();
37 * boolean param_4 = obj.empty();
38 */