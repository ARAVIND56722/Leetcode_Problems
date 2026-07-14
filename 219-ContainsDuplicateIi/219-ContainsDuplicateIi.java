// Last updated: 14/7/2026, 2:17:49 pm
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            int i=0;
            while(i<nums.length){
            for(int j=i+1;j<nums.length  && j<=i+k;j++){
                   if(nums[i]==nums[j]){
                    return true;
                   } 
            }
            i++;
            }
        return false;
        }
    }
