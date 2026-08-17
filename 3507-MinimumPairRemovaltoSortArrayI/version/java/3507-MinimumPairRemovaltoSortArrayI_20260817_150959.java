// Last updated: 17/8/2026, 3:09:59 pm
1class Solution {
2    public int minimumPairRemoval(int[] nums) {
3
4        ArrayList<Integer> list = new ArrayList<>();
5        for(int i=0;i<nums.length;i++){
6            list.add(nums[i]);
7        }
8       
9       
10        int count=0;
11        while(list.size()>1){
12            boolean sorted=true;
13            for(int k=0;k<list.size()-1;k++){
14                if(list.get(k)>list.get(k+1)){
15                    sorted=false;
16                }
17            }
18            if(sorted){
19                break;
20            }
21            int min = list.get(0)+list.get(1);
22            int num=0;
23        for (int i = 0; i < list.size() - 1; i++) {
24            int sum = list.get(i)+list.get(i+1);
25            if (sum < min) {
26                min = sum;
27                num=i;
28            }
29        }
30        count++;
31        list.set(num,list.get(num)+list.get(num+1));
32        list.remove(num+1);
33        }
34        return count;
35    }
36}