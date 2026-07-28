// Last updated: 28/7/2026, 3:58:30 pm
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int len=s1.length();
4        HashMap <Character,Integer> map=new HashMap<>();
5        for(int i=0;i<s1.length();i++){
6          char ch=s1.charAt(i);
7          map.put(ch,map.getOrDefault(ch,0)+1);
8        }
9        int left=0;
10        HashMap <Character,Integer> map2=new HashMap<>();
11        for(int right=0;right<s2.length();right++){
12          char ch=s2.charAt(right);
13          map2.put(ch,map2.getOrDefault(ch,0)+1);
14          if(right-left+1>s1.length()){
15            char remove=s2.charAt(left);
16            map2.put(remove,map2.get(remove)-1);
17            if(map2.get(remove)==0){
18                map2.remove(remove);
19            }
20            left++;
21          }
22          if(map.equals(map2)){
23            return true;
24          }
25        }
26        return false;
27    }
28}