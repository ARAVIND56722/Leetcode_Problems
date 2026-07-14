// Last updated: 14/7/2026, 2:18:14 pm
class Solution {
    public boolean isPalindrome(String s) {
       
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            return true;
        }
        return false;

        
    }
}