// Last updated: 18/7/2026, 7:40:42 pm
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3        HashMap <Character,Integer> map=new HashMap<>();
4        for(char ch:magazine.toCharArray()){
5            map.put(ch,map.getOrDefault(ch,0)+1);
6        }
7        for(char ch:ransomNote.toCharArray()){
8            if(!map.containsKey(ch) || map.get(ch)==0){
9                return false;
10            }
11            map.put(ch,map.get(ch)-1);
12        }
13        return true;
14        }
15    }
16