// Last updated: 14/7/2026, 2:18:02 pm
class Solution {
    public int majorityElement(int[] nums) {
       Arrays.sort(nums);
       return nums[nums.length/2];
    }
}