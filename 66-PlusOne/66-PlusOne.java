// Last updated: 14/7/2026, 2:18:29 pm
class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
	if (digits[i] < 9) {
		digits[i]++;
		return digits;
	}
	digits[i] = 0;
}

digits = new int[digits.length + 1];
digits[0] = 1;
return digits;
        

    }
}