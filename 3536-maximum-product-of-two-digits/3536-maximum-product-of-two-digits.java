class Solution {
    public int maxProduct(int n) {
        int fmax=-1;
        int smax=-1;
        while(n!=0){
            int digit=n%10;
            if(digit>=fmax){
                smax=fmax;
                fmax=digit;
            }else if(digit>=smax){
                smax=digit;
            }
            n/=10;
        }
        return fmax*smax;
    }
}