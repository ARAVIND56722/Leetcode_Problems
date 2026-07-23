// Last updated: 23/7/2026, 9:42:33 pm
1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3        HashMap <Integer,Integer> map=new HashMap<>();
4        for(int n:nums){
5            map.put(n,map.getOrDefault(n,0)+1);
6        }
7
8        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
9
10        
11        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
12
13        
14        int[] ans = new int[k];
15
16        for (int i = 0; i < k; i++) {
17            ans[i] = list.get(i).getKey();
18        }
19
20        return ans;
21        
22    }
23}