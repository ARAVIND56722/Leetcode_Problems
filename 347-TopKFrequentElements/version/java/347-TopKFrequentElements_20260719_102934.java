// Last updated: 19/7/2026, 10:29:34 am
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        HashMap <Character,Character> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char ch1=s.charAt(i);
6            char ch2=t.charAt(i);
7            if(map.containsKey(ch1)){
8             if(map.get(ch1)!= ch2){
9                return false;
10             }
11            }
12            else{
13                if(map.containsValue(ch2)){
14                    return false;
15                }
16              map.put(ch1,ch2);
17            }
18        }
19        return true;
20    }
21}