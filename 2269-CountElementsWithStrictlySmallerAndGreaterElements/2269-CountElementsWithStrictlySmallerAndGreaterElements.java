// Last updated: 14/7/2026, 2:15:56 pm
class Solution {
    public int countElements(int[] nums) {
       
        int count=0;
        for(int i=0;i<nums.length;i++){
             boolean bigger=false;
             boolean smaller=false;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                  bigger=true;
                }
                if(nums[i]<nums[j]){
                    smaller=true;
                }
            }
            if(bigger && smaller){
                count++;
            }
        }
        return count;
    }
}