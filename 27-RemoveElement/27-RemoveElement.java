// Last updated: 14/7/2026, 2:18:40 pm
class Solution {
    public int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];

            }
        }
        return j;
        
    }
}