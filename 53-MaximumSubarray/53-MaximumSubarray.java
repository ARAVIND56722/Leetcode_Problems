// Last updated: 14/7/2026, 2:18:32 pm
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length==1 && nums[0]==1){
            return 1;
        }
        
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }

        }   
        return max;     
    }
}