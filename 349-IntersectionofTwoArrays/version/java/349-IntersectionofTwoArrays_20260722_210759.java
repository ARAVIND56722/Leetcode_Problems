// Last updated: 22/7/2026, 9:07:59 pm
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        HashMap <Integer,Integer> map= new HashMap<>();
4        
5        ArrayList<Integer> arr=new ArrayList<>();
6        
7        for(int i=0;i<nums2.length;i++){
8            map.put(nums2[i],map.getOrDefault(nums2[i],0)+1);
9        }
10        for(int key:nums1){
11            if(map.containsKey(key) && map.get(key)>0){
12               map.put(key,map.getOrDefault(key,0)-1);
13               arr.add(key);
14            }
15        }
16        int res[]=new int[arr.size()];
17        for(int i=0;i<res.length;i++){
18            res[i]=arr.get(i);
19        }
20        return res;
21
22    }
23}