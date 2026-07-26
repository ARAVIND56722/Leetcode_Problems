// Last updated: 26/7/2026, 2:46:37 pm
1class Solution {
2    public boolean isPalindrome(String s) {
3        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
4        int left=0;
5        int right=s.length()-1;
6        char arr[]=s.toCharArray();
7        while(left<right){
8             char temp=arr[left];
9             arr[left]=arr[right];
10             arr[right]=temp;
11             left++;
12             right--;
13        }
14        String str=new String(arr);
15        if(str.equals(s)){
16            return true;
17        }
18        return false;
19    }
20}