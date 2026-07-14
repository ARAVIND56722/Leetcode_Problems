// Last updated: 14/7/2026, 2:15:42 pm
class Solution {
    public int countDigits(int num) {
        int count=0;
        int original=num;
        while(num>0){
            int n=num%10;
            if(original%n==0){
                count++;
            }
            num=num/10;
        }
        return count;
    }
}