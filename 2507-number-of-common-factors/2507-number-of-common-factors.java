class Solution {
    public int commonFactors(int a, int b) {
        int val=gcd(a,b);
        int count=1;
        for(int i=2;i<=val;i++){
            if(val%i==0) count++;
        }
        return count;
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}