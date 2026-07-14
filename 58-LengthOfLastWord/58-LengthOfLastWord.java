// Last updated: 14/7/2026, 2:18:31 pm
class Solution {
    public int lengthOfLastWord(String s) {
        String words[]=s.split(" ");
        String word=words[words.length-1];
        return word.length();
    }
}
         