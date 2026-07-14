// Last updated: 14/7/2026, 2:16:35 pm
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         boolean occurances=false;
         Arrays.sort(arr);
         int p=0;
         int freq[]=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                   if(arr[i]==arr[j]){
                     count++;
                   }
            }
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for(int k=0;k<p;k++){
                if(count==freq[k]){
                    return false;
                }
                
            }
            freq[p]=count;
            p++;
           
    }
    return true;
}
}