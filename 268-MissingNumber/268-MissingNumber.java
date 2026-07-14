// Last updated: 14/7/2026, 2:17:38 pm
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
    
            int sum=0;
            int sums=0;
            
            for(int i=0;i<n;i++){
                sum=sum+nums[i];
            }
            for(int j=0;j<=n;j++){
                sums=sums+j;
            }
            result=sums-sum;
           
        
         return result;
        
    }
}