// Last updated: 14/9/2026, 1:24:56 pm
1class MyQueue {
2    Stack<Integer> st1;
3    Stack<Integer> st2;
4   
5    public MyQueue() {
6        st1=new Stack <>();
7        st2=new Stack <>();
8    }
9    
10    public void push(int x) {
11          st1.push(x);
12
13    }
14    
15    public int pop() {
16        if(st2.isEmpty()){
17           while(!st1.isEmpty()){
18              st2.push(st1.pop());
19           }
20        }
21        return st2.pop();
22    }
23    
24    public int peek() {
25        if(st2.isEmpty()){
26            while(!st1.isEmpty()){
27                st2.push(st1.pop());
28            }
29        }
30        return st2.peek();
31    }
32    
33    public boolean empty() {
34        return st1.isEmpty() && st2.isEmpty();
35    }
36}
37
38/**
39 * Your MyQueue object will be instantiated and called as such:
40 * MyQueue obj = new MyQueue();
41 * obj.push(x);
42 * int param_2 = obj.pop();
43 * int param_3 = obj.peek();
44 * boolean param_4 = obj.empty();
45 */