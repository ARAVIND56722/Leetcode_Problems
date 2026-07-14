// Last updated: 14/7/2026, 2:17:16 pm
class Solution {
    public int countSegments(String s) {
        if(s==null || s.length()==0 || s.trim().isEmpty()){
            return 0;
        }
        String str[]=s.trim().split("\\s+");
    
        return str.length;
    }
}