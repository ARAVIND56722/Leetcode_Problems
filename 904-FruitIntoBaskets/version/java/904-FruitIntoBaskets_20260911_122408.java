// Last updated: 11/9/2026, 12:24:08 pm
1class Solution {
2    public int totalFruit(int[] fruits) {
3        HashMap<Integer,Integer> map= new HashMap<>();
4        int left=0;
5        int max=0;
6        for(int right=0;right<fruits.length;right++){
7            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);
8            while(map.size()>2){
9                map.put(fruits[left],map.get(fruits[left])-1);
10                if(map.get(fruits[left])==0){
11                    map.remove(fruits[left]);
12                }
13                left++;
14            }
15            max = Math.max(max, right - left + 1);
16
17        }
18        
19        return max;
20    }
21}