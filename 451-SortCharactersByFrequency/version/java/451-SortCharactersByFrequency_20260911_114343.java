// Last updated: 11/9/2026, 11:43:43 am
1class Solution {
2    public String frequencySort(String s) {
3        HashMap <Character,Integer> map=new HashMap<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            map.put(ch,map.getOrDefault(ch,0)+1);
7        }
8        List<Map.Entry<Character,Integer>> list =new ArrayList<>(map.entrySet());
9        String res="";
10        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
11        for(Map.Entry<Character,Integer> entry:list){
12               int n=entry.getValue();
13               char ch=entry.getKey();
14               for(int i=0;i<n;i++){
15                  res=res+ch;
16               }
17        }
18        return res;
19       
20    }
21}