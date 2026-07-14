// Last updated: 14/7/2026, 2:17:04 pm
class Solution {
    public String reverseWords(String s) {
        String str[]=s.trim().split(" ");
        String res="";
        for(int i=0;i<str.length;i++){
            String word=str[i];
            for(int j=word.length()-1;j>=0;j--){
                   res = res+word.charAt(j);
            }
            if(i!=str.length-1){
                res=res+" ";
            }
        }
        return res;
    }
}