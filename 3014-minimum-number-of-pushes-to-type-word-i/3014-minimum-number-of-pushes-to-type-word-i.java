class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int res=0;
        int multiplier=1;
        while(n>0){
            if(n>=8){
                res=res+(8*multiplier);
                multiplier++;
                n-=8;
            }else{
                res=res+(n*multiplier);
                n=0;
            }
        }
        return res;
    }
}