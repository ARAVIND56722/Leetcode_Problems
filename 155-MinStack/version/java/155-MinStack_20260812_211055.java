// Last updated: 12/8/2026, 9:10:55 pm
1class MinStack {
2      int[] stack;
3      int[] minStack;
4      int top;
5      int minTop;
6    public MinStack() {
7        stack=new int[30000];
8        minStack=new int[30000];
9        top=-1;
10        minTop=-1;
11    }
12    
13    public void push(int value) {
14        top++;
15        stack[top]=value;
16        if(minTop==-1 || value<=minStack[minTop]){
17            minTop++;
18            minStack[minTop]=value;
19        }
20
21    }
22    
23    public void pop() {
24        if(stack[top]==minStack[minTop]){
25            minTop--;
26        }
27        top--;
28        
29    }
30    
31    public int top() {
32        return stack[top];
33        
34    }
35    
36    public int getMin() {
37         return minStack[minTop];
38    }
39}
40
41/**
42 * Your MinStack object will be instantiated and called as such:
43 * MinStack obj = new MinStack();
44 * obj.push(value);
45 * obj.pop();
46 * int param_3 = obj.top();
47 * int param_4 = obj.getMin();
48 */