// Last updated: 14/7/2026, 2:17:36 pm
class Solution {
    public void moveZeroes(int[] nums) {
      
        int right=0;
        for(int left=0;left<nums.length;left++){
            if(nums[left]!=0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                 right++;
            }
           
        }
    }
}