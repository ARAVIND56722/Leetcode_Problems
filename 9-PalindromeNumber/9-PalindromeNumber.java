// Last updated: 14/7/2026, 2:18:49 pm
class Solution {
    public boolean isPalindrome(int x) {
       int reverse =0;
       
       int original=x;
       while(x!=0){
        int digit=x%10;
        reverse=reverse*10+digit;
        x=x/10;
       } 
       x=original;
       if(reverse == original && x>=0){
        return true;
       }
       else{
      
        return false;
       }
        
    }
}