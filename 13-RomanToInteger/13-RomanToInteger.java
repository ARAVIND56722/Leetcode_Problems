// Last updated: 14/7/2026, 2:18:47 pm
import java.util.*;
class Solution {
    public static void main(String[]args)  {
        Scanner sc=new Scanner(System.in);
        String roman =sc.nextLine().toUpperCase();
        int result=romanToInt(roman);
        System.out.println(result);
    }
        public static int  romanToInt(String s){
         HashMap<Character,Integer> map=new HashMap<> ();
         map.put('I',1);
         map.put('V',5);
         map.put('X',10);
         map.put('L',50);
         map.put('C',100);
         map.put('D',500);
         map.put('M',1000);
        
        int total=0;
        int prevValue=0;
        for(int  i=s.length()-1;i>=0;i--){
            int value=map.get(s.charAt(i));
            if(value<prevValue){
                total=total-value;
            }
            else{
                total=total+value;
            }
        prevValue=value;

        }
        return total;  
    }
}
