// Last updated: 14/7/2026, 2:18:42 pm
class Solution {
    public int removeDuplicates(int[] nums) {
        nums[0]=nums[0];
        int j=1;
        for(int i=1;i<nums.length;i++){
            
                if(nums[i-1]!=nums[i]){
                    nums[j++]=nums[i];
                }
            }
            return j;
        }
    }

