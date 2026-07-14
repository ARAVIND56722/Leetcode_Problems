// Last updated: 14/7/2026, 2:15:53 pm
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8){
            return false;
        }
        boolean hasUpp=false;
        boolean hasLow=false;
        boolean hasDig=false;
        boolean hasSym=false;
            for(int i=0;i<password.length();i++){
                char ch=password.charAt(i);

                if (i > 0 && ch == password.charAt(i - 1)) {
                return false;
            }
                if(Character.isUpperCase(ch)){
                    hasUpp=true;
                }
                else if(Character.isLowerCase(ch)){
                    hasLow=true;
                }
                else if(Character.isDigit(ch)){
                    hasDig=true;
                }
                else{
                    hasSym=true;
                }
            }
            return hasUpp && hasLow && hasDig && hasSym;
            
        }
        
        
    }
