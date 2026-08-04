// Last updated: 4/8/2026, 11:29:44 am
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List <Integer> list=new ArrayList<>();
4        int max=Integer.MIN_VALUE;
5        int min=Integer.MAX_VALUE;
6        HashMap <Integer,Integer> map=new HashMap<>();
7        for(int i=0;i<nums.length;i++){
8           map.put(nums[i],map.getOrDefault(nums[i],0)+1);
9           if(nums[i]>max){
10            max=nums[i];
11           }
12           if(nums[i]<min){
13            min=nums[i];
14           }
15        }
16        for(int i=min;i<=max;i++){
17            if(!(map.containsKey(i))){
18                  list.add(i);
19            }
20        }
21        
22        return list;
23
24    }
25}