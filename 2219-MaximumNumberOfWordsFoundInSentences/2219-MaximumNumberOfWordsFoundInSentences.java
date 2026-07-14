// Last updated: 14/7/2026, 2:15:59 pm
class Solution {
    public int mostWordsFound(String[] sentences) {
        int length=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            String words[]=str.split(" ");
            if(words.length>length){
                length=words.length;
            }
        
        }
        return length;
        


    }
}