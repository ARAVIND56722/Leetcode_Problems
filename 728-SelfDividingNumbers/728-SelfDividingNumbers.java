// Last updated: 14/7/2026, 2:16:58 pm
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for(int i=left;i<=right;i++){
            int res=i;
            boolean found=true;
            while(res>0){
                int n=res%10;
                if(n==0 ||i%n!=0){
                    found=false;
                    break;
                }
                res=res/10;
            }
            if(found){
                list.add(i);
            }
        }
        return list;
    }
}