// Last updated: 17/9/2026, 6:34:36 pm
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map=new HashMap<>();
4         for(int i=0;i<strs.length;i++){
5            String s=strs[i];
6            char ch[]=s.toCharArray();
7            Arrays.sort(ch);
8            String st=new String(ch);
9            map.put(st,map.getOrDefault(st,new ArrayList<>()));
10            map.get(st).add(s);
11         }
12         return new ArrayList<>(map.values());
13    }
14}