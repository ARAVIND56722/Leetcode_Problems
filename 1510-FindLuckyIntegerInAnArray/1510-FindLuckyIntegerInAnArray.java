// Last updated: 14/7/2026, 2:16:18 pm
class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==arr[i]){
                return arr[i];
            }
        }
        return -1;
    }
}