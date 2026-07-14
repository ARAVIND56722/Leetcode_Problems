// Last updated: 14/7/2026, 2:18:04 pm
class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split("\\s+");
        String res="";
        for(int i=str.length-1;i>=0;i--){
          res=res+str[i]; 
          if(i!=0){
            res=res+" ";
          } 
        }
        return res;
    }
    
}