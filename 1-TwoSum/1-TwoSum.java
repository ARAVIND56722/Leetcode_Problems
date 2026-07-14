// Last updated: 14/7/2026, 2:18:56 pm
import java.util.Scanner;
class Solution{
    public int[] twoSum(int[] nums, int target) {

        Scanner sc=new Scanner(System.in);
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(target==nums[i]+nums[j]){
                System.out.println(target);
                return new int[] {i,j};
            }
            }
        }
        return new int[] {};
    }
}
