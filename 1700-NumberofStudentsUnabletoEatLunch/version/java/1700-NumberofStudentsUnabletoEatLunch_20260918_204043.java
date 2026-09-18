// Last updated: 18/9/2026, 8:40:43 pm
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Stack <Integer> st=new Stack<>();
4        for(int i=sandwiches.length-1;i>=0;i--){
5            st.push(sandwiches[i]);
6        }
7        Queue <Integer> que= new LinkedList<>();
8        for(int j=0;j<students.length;j++){
9             que.offer(students[j]);
10        }
11        int count=0;
12        while(!st.isEmpty()){
13            if(que.peek()==st.peek()){
14                st.pop();
15                que.remove();
16                count=0;
17            }
18            else{
19                count++;
20                 int q=que.remove();
21                 que.offer(q);
22            }
23            if(count==que.size()){
24                return que.size();
25            }
26        }
27        return 0;
28    }
29}