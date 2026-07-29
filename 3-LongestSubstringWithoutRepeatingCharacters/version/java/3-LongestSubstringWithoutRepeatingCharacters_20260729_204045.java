// Last updated: 29/7/2026, 8:40:45 pm
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashMap <Character,Integer> map=new HashMap<>();
4        int max=0;
5        
6        int left=0;
7        for(int right=0;right<s.length();right++){
8            char ch=s.charAt(right);
9            map.put(ch,map.getOrDefault(ch,0)+1);
10            
11            while(map.get(ch)==2){
12                map.put(s.charAt(left),map.get(s.charAt(left))-1);
13                if(map.get(s.charAt(left))==0){
14                    map.remove(s.charAt(left));
15                 }
16                 left++;
17
18                 
19            }
20            
21            if(max<map.size()){
22               max=map.size();
23            }
24        }
25        return max;
26    }
27}