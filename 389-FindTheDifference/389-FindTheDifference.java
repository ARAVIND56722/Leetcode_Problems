// Last updated: 14/7/2026, 2:17:24 pm
class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        for(char ch: s.toCharArray()){
            res^=ch;
        }

        for(char ch: t.toCharArray()){
            res ^=ch;
        }
        return res;

    }
}