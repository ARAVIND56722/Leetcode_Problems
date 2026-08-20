// Last updated: 20/8/2026, 5:59:20 pm
1class Solution {
2    public String simplifyPath(String path) {
3        Stack <String> stack= new Stack<>();
4        String arr[]=path.split("/");
5       
6        for(int i=0;i<arr.length;i++){
7            if(arr[i].equals("")) {
8                continue;
9            }
10            else if(arr[i].equals("..")){
11                if(!stack.isEmpty()){
12                stack.pop();
13                }
14            }
15            else if(arr[i].equals(".")){
16                continue;
17            }
18            else{
19                stack.push(arr[i]);
20            }
21
22        }
23        StringBuffer sb=new StringBuffer();
24        while(!stack.isEmpty()){
25            sb.insert(0,"/"+stack.pop());
26        }
27        if(sb.length() == 0) {
28            return "/";
29        }
30        return sb.toString();
31      
32    }
33}
34