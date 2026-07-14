// Last updated: 14/7/2026, 2:17:43 pm
class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length()  ){
            return false;

        }
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}