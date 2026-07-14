// Last updated: 14/7/2026, 2:17:30 pm
class Solution {
    public String reverseVowels(String s) {
        int left=0;
        int right=s.length()-1;
        char ch[]=s.toCharArray();
        while(left<right){
            while(left<right && !isVowel(ch[left])){
                left++;
            }
             while(left<right && !isVowel(ch[right])){
                right--;
            }
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
    }
     public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}