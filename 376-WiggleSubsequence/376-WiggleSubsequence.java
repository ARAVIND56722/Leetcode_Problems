// Last updated: 14/7/2026, 2:17:29 pm
class Solution {
    public int wiggleMaxLength(int[] nums) {
        int prevDiff=0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            int diff = nums[i] - nums[i-1];
            if(diff > 0){
                if(prevDiff<0 || prevDiff==0){
                count++; 
                prevDiff=diff;
                }
            }
            if(diff<0){
                if(prevDiff>0 || prevDiff==0){
                    count++;
                    prevDiff=diff;
                }
            }
        }
        return count;
    }
}