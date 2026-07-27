// Last updated: 27/7/2026, 10:00:26 pm
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        List <Integer> list = new ArrayList<>();
4        int len=p.length();
5        char arr[]=p.toCharArray();
6        Arrays.sort(arr);
7        String str=new String(arr);
8        for(int i=0;i+len<=s.length();i++){
9            String res=s.substring(i,i+len);
10            char arr1[]=res.toCharArray();
11            Arrays.sort(arr1);
12            String str1=new String(arr1);
13            if(str.equals(str1)){
14                list.add(i);
15            }
16        }
17        return list;
18    }
19}