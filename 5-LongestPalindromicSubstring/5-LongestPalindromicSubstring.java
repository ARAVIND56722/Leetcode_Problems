// Last updated: 14/7/2026, 2:18:52 pm
class Solution {
    public String longestPalindrome(String s) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            
            int left = i;
            int right = i;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            left++;
            right--;

            if ((right - left) > (end - start)) {
                start = left;
                end = right;
            }

            
            left = i;
            right = i + 1;

            while (left >= 0 &&
                   right < s.length() &&
                   s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }

            left++;
            right--;

            if ((right - left) > (end - start)) {
                start = left;
                end = right;
            }
        }

        return s.substring(start, end + 1);
    }
}