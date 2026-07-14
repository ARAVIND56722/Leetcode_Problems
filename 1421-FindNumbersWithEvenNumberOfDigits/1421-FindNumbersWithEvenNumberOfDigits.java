// Last updated: 14/7/2026, 2:16:33 pm
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(String.valueOf(num).length()%2==0){
                count++;
            }
        }
        return count;
    }
}