// Last updated: 14/7/2026, 2:15:57 pm
class Solution {
    public String capitalizeTitle(String title) {
        String arr[]=title.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++){
            String word=arr[i];
            if(word.length()>=3){
                word=word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
            }
            else{
                word=word.toLowerCase();
            }
            sb.append(word);
            if(i!=arr.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
        
        
    }
}