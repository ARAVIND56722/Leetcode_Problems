// Last updated: 13/9/2026, 8:23:55 pm
1
2class Solution {
3    public List<List<Integer>> threeSum(int[] nums) {
4
5        List<List<Integer>> result = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < nums.length - 2; i++) {
10
11            
12            if (i > 0 && nums[i] == nums[i - 1]) {
13                continue;
14            }
15
16            int left = i + 1;
17            int right = nums.length - 1;
18
19            while (left < right) {
20
21                int sum = nums[i] + nums[left] + nums[right];
22
23                if (sum == 0) {
24
25                    result.add(Arrays.asList(
26                        nums[i],
27                        nums[left],
28                        nums[right]
29                    ));
30
31                    
32                    while (left < right &&
33                           nums[left] == nums[left + 1]) {
34                        left++;
35                    }
36
37                    while (left < right &&
38                           nums[right] == nums[right - 1]) {
39                        right--;
40                    }
41
42                    left++;
43                    right--;
44
45                } 
46                else if (sum < 0) {
47                    left++;
48                } 
49                else {
50                    right--;
51                }
52            }
53        }
54
55        return result;
56    }
57}
58