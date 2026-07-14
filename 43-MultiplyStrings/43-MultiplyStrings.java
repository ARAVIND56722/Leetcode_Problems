// Last updated: 14/7/2026, 2:18:34 pm
class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int res[]=new int[m+n];
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';
                int prod=d1*d2;
                int pos1=i+j;
                int pos2=i+j+1;

                int sum=prod+res[pos2];
                res[pos2]=sum%10;
                res[pos1]+=sum/10;


            }
        }
        StringBuffer sb= new StringBuffer();
        for(int num:res){
            if(!(sb.length()==0 && num==0)){
                sb.append(num);
            }
        }
        return sb.toString();
        
    }
}