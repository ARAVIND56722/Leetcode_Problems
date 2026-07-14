// Last updated: 14/7/2026, 2:17:08 pm
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
              sum=sum+i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}