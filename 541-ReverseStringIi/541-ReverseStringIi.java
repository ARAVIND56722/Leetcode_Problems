// Last updated: 14/7/2026, 2:17:02 pm
class Solution {
    public String reverseStr(String s, int k) {
        String rev="";
       for(int i=0; i<s.length() ; i+=2*k){
         for(int j=k-1; j>=0 ; j--){
            if(i+j < s.length()){
                 rev=rev+s.charAt(i+j);
            }
         }
         for(int j=k; j<2*k;j++){
            if(i+j<s.length()){
                rev=rev+s.charAt(i+j);
            }
         }
         
             }

             return rev; 

    }
}