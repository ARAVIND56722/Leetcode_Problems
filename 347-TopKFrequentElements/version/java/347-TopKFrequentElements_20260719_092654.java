// Last updated: 19/7/2026, 9:26:54 am
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        HashMap <Integer,Integer> map =new HashMap<>();
4        for(int n:nums2){
5            map.put(n,map.getOrDefault(n,0)+1);
6        }
7        HashSet <Integer> set=new HashSet<>();
8        for(int i=0;i<nums1.length;i++){
9            if(map.containsKey(nums1[i])){
10                set.add(nums1[i]);
11            }
12        }
13        int ans[]=new int[set.size()];
14        int index=0;
15        for(int num:set){
16            ans[index++]=num;
17        }
18        return ans;
19    
20    }
21}